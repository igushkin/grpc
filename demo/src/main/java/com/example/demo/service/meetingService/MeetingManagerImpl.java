package com.example.demo.service.meetingService;

import com.google.protobuf.Int32Value;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MeetingManagerImpl extends MeetingManagerGrpc.MeetingManagerImplBase {

    List<Book.Meeting> meetingList;

    public MeetingManagerImpl() {
        this.meetingList = new ArrayList<>();
    }

    // Unary
    @Override
    public void bookMeeting(Book.Meeting request, StreamObserver<Int32Value> responseObserver) {
        Book.User user = request.getUser();

        List userMeetings = meetingList.stream().filter(x -> x.getUser().getId() == user.getId()).collect(Collectors.toList());

        // if there is time intersaction, throw new error


        // otherwise save meeting
        this.meetingList.add(request);

    }

    // Server stream
    @Override
    public void getUserMeetings(Int32Value request, StreamObserver<Book.Meeting> responseObserver) {
        super.getUserMeetings(request, responseObserver);
    }

    // Client stream
    @Override
    public StreamObserver<Book.Meeting> countMeetings(StreamObserver<Int32Value> responseObserver) {
        return super.countMeetings(responseObserver);
    }
}
