package com.example.demo.service.meetingService;

import com.google.protobuf.Int32Value;
import com.google.protobuf.MessageLite;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MeetingManagerImpl extends MeetingManagerGrpc.MeetingManagerImplBase {

    List<MeetingService.Meeting> meetingList;

    public MeetingManagerImpl() {
        this.meetingList = new ArrayList<>();
    }

    // Unary
    @Override
    public void bookMeeting(MeetingService.Meeting request, StreamObserver<Int32Value> responseObserver) {
        //Book.User user = request.getUser();

        //List userMeetings = meetingList.stream().filter(x -> x.getUser().getId() == user.getId()).collect(Collectors.toList());

        // if there is time intersaction, throw new error

        // otherwise save meeting
        this.meetingList.add(request);
        responseObserver.onNext(Int32Value.newBuilder().setValue(1).build());
        responseObserver.onCompleted();
    }

    // Server stream
    @Override
    public void getUserMeetings(Int32Value request, StreamObserver<MeetingService.Meeting> responseObserver) {
        List<MeetingService.Meeting> userMeetings = meetingList.stream().filter(x -> x.getUserId() == request.getValue()).collect(Collectors.toList());

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
}
