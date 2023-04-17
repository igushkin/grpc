package com.example.demo.service.meetingService;

import com.example.demo.service.userService.UserService;
import com.google.protobuf.Int32Value;
import io.grpc.stub.StreamObserver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MeetingManagerImpl extends MeetingManagerGrpc.MeetingManagerImplBase {

    List<MeetingService.Meeting> meetingStorage;
    File meetingFileStorage;

    public MeetingManagerImpl() throws IOException {
        this.meetingStorage = new ArrayList<>();
        meetingFileStorage = new File("meetingDB.txt");
        meetingFileStorage.createNewFile();
        readFromFile();
    }

    // Unary
    @Override
    public void bookMeeting(MeetingService.Meeting request, StreamObserver<Int32Value> responseObserver) {
        //Book.User user = request.getUser();

        //List userMeetings = meetingList.stream().filter(x -> x.getUser().getId() == user.getId()).collect(Collectors.toList());

        // if there is time intersaction, throw new error

        // otherwise save meeting
        try {
            this.meetingStorage.add(request);
            saveToFile();
            responseObserver.onNext(Int32Value.newBuilder().setValue(request.getId()).build());
            responseObserver.onCompleted();
        } catch (Exception e) {

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
    public StreamObserver<MeetingService.Meeting> countMeetings(StreamObserver<Int32Value> responseObserver) {
        return super.countMeetings(responseObserver);
    }

    private void saveToFile() throws IOException {
        try (FileOutputStream output = new FileOutputStream(meetingFileStorage, false)) {
            for (MeetingService.Meeting meeting : meetingStorage) {
                meeting.writeDelimitedTo(output);
            }
        }
    }

    private void readFromFile() throws IOException {
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
