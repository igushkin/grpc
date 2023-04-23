package com.example.demo.serviceImpl.meetingService;

import com.google.protobuf.Int32Value;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MeetingManagerImpl extends MeetingManagerGrpc.MeetingManagerImplBase {

    private final List<MeetingService.Meeting> meetingStorage;
    private final File meetingFileStorage;

    public MeetingManagerImpl() throws IOException {
        this.meetingStorage = new ArrayList<>();
        meetingFileStorage = new File("meetingDB.txt");
        meetingFileStorage.createNewFile();
        restoreData();
    }

    // Unary
    @Override
    public void addMeeting(MeetingService.Meeting request, StreamObserver<Int32Value> responseObserver) {
        try {
            if (request.getTime().getSeconds() < Instant.now().getEpochSecond()) {
                responseObserver.onError(Status
                        .INVALID_ARGUMENT
                        .withDescription("The wrong date of the meeting was selected. You can't book an appointment in the past.")
                        .asException());
            } else {
                this.meetingStorage.add(request);
                saveToFile();
                responseObserver.onNext(Int32Value.newBuilder().setValue(request.getId()).build());
                responseObserver.onCompleted();
            }
        } catch (Exception e) {
            System.out.println(e.getCause());
        }
    }

    // Server stream
    @Override
    public void getUserMeetings(Int32Value request, StreamObserver<MeetingService.Meeting> responseObserver) {
        List<MeetingService.Meeting> userMeetings = meetingStorage.stream().filter(x -> x.getUserId() == request.getValue()).collect(Collectors.toList());

        for (MeetingService.Meeting meeting : userMeetings) {

            responseObserver.onNext(meeting);
        }

        responseObserver.onCompleted();
    }

    // Client stream
    @Override
    public StreamObserver<Int32Value> getReport(StreamObserver<MeetingService.Report> responseObserver) {

        List<Integer> userIDs = new ArrayList<>();
        return new StreamObserver<>() {
            @Override
            public void onNext(Int32Value value) {
                if (value != null) {
                    userIDs.add(value.getValue());
                }
            }

            @Override
            public void onError(Throwable t) {
            }

            @Override
            public void onCompleted() {
                // Meetings with specific users
                List<MeetingService.Meeting> meetings = meetingStorage
                        .stream()
                        .filter(x -> userIDs.contains(x.getUserId()))
                        .collect(Collectors.toList());

                // Total num of meetings
                int numOfMeetings = meetings.size();

                // Stat by the user
                Map<Integer, Double> statByUser = userIDs
                        .stream()
                        .map(x -> Map.entry(x, 0.0))
                        .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

                meetings.stream()
                        .collect(Collectors.groupingBy(x -> x.getUserId(), Collectors.counting()))
                        .entrySet()
                        .stream()
                        .map(x -> Map.entry(x.getKey(), x.getValue() * 1.0 / numOfMeetings))
                        .forEach(x -> statByUser.put(x.getKey(), x.getValue()));


                // Stat by the day of the week
                Map<Integer, Double> statByDayOfTheWeek = Stream.of(
                        new AbstractMap.SimpleEntry<>(1, 0.0),
                        new AbstractMap.SimpleEntry<>(2, 0.0),
                        new AbstractMap.SimpleEntry<>(3, 0.0),
                        new AbstractMap.SimpleEntry<>(4, 0.0),
                        new AbstractMap.SimpleEntry<>(5, 0.0),
                        new AbstractMap.SimpleEntry<>(6, 0.0),
                        new AbstractMap.SimpleEntry<>(7, 0.0)
                ).collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

                meetings.stream()
                        .collect(Collectors.groupingBy(x -> extractDayOfTheWeek(x.getTime().getSeconds()), Collectors.counting()))
                        .entrySet()
                        .stream()
                        .map(x -> Map.entry(x.getKey(), x.getValue() * 1.0 / numOfMeetings))
                        .forEach(x -> statByDayOfTheWeek.put(x.getKey(), x.getValue()));

                // Build report
                responseObserver.onNext(MeetingService.Report
                        .newBuilder()
                        .setNumOfMeetings(numOfMeetings)
                        .putAllStatByUser(statByUser)
                        .putAllStatByDayOfTheWeek(statByDayOfTheWeek)
                        .build()
                );

                responseObserver.onCompleted();
            }
        };

    }

    private int extractDayOfTheWeek(long date) {
        return Instant.ofEpochSecond(date)
                .atZone(ZoneId.systemDefault())
                .toLocalDate()
                .getDayOfWeek()
                .getValue();
    }

    private void saveToFile() throws IOException {
        try (FileOutputStream output = new FileOutputStream(meetingFileStorage, false)) {
            for (MeetingService.Meeting meeting : meetingStorage) {
                meeting.writeDelimitedTo(output);
            }
        }
    }

    private void restoreData() throws IOException {
        try (FileInputStream input = new FileInputStream(meetingFileStorage)) {
            while (true) {
                MeetingService.Meeting meeting = MeetingService.Meeting.parseDelimitedFrom(input);
                if (meeting == null) { // parseDelimitedFrom returns null on EOF
                    break;
                }
                this.meetingStorage.add(meeting);
            }
        }
    }
}
