package com.example.demo.serviceUse;

import com.example.demo.serviceServer.MeetingServiceServer;
import com.example.demo.serviceImpl.meetingService.MeetingManagerGrpc;
import com.example.demo.serviceImpl.meetingService.MeetingService;
import com.example.demo.serviceImpl.userService.UserService;
import com.example.demo.serviceUse.serviceDiscovery.ServiceDiscovery;
import com.google.protobuf.Int32Value;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;

import javax.jmdns.ServiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MeetingManager extends gRPCService {

    private final static ServiceInfo serviceInfo;

    static {
        try {
            serviceInfo = ServiceDiscovery.getServiceInfo(MeetingServiceServer.SERVICE_TYPE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    //rpc bookMeeting(Meeting) returns (google.protobuf.Int32Value);
    //rpc getUserMeetings(google.protobuf.Int32Value) returns (stream Meeting);
    //rpc getReport(stream google.protobuf.Int32Value) returns (Report);

    public static int addMeeting(MeetingService.Meeting meeting) {
        ManagedChannel channel = getChannel(serviceInfo);
        MeetingManagerGrpc.MeetingManagerBlockingStub blockingStub = MeetingManagerGrpc.newBlockingStub(channel);
        return blockingStub.bookMeeting(meeting).getValue();
    }

    public static List<MeetingService.Meeting> getUserMeetings(int userID) {
        ManagedChannel channel = getChannel(serviceInfo);
        MeetingManagerGrpc.MeetingManagerBlockingStub blockingStub = MeetingManagerGrpc.newBlockingStub(channel);
        List<MeetingService.Meeting> meetings = new ArrayList<>();
        Iterator<MeetingService.Meeting> itr = blockingStub.getUserMeetings(Int32Value.newBuilder().setValue(userID).build());
        itr.forEachRemaining(meetings::add);

        return meetings;
    }

    public static MeetingService.Report getReport(List<Integer> userIDs) throws InterruptedException {
        final MeetingService.Report[] report = new MeetingService.Report[1];
        List<UserService.User> users = UserManager.getAllUsers();

        StreamObserver<MeetingService.Report> updateOrderResponseObserver = new StreamObserver<>() {
            @Override
            public void onNext(MeetingService.Report value) {
                report[0] = value;
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
            }
        };

        MeetingManagerGrpc.MeetingManagerStub asyncStub = MeetingManagerGrpc.newStub(getChannel(serviceInfo));
        StreamObserver<Int32Value> updateOrderRequestObserver = asyncStub.getReport(updateOrderResponseObserver);
        for (int userId : userIDs) {
            updateOrderRequestObserver.onNext(Int32Value.newBuilder().setValue(userId).build());
            //updateOrderRequestObserver.onNext(Int32Value.newBuilder().setValue(2).build());
            //updateOrderRequestObserver.onNext(Int32Value.newBuilder().setValue(3).build());
        }

        updateOrderRequestObserver.onCompleted();

        Thread.sleep(1000);

        return report[0];

        /*ModelAndView modelAndView = new ModelAndView("meetingService/method/notImplemented.html");
        modelAndView.addObject("numOfMeetings", report[0].getNumOfMeetings());

        Map<String, Double> statByUser = report[0].getStatByUserMap()
                .entrySet()
                .stream()
                .map(x -> Map.entry(users.stream().filter(u -> u.getId() == x.getKey()).findFirst().get().getName(), Math.round(x.getValue() * 10000) / 100.0))
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        modelAndView.addObject("statByUser", statByUser);

        modelAndView.addObject("statByDay",
                report[0].getStatByDayOfTheWeekMap()
                        .values()
                        .stream()
                        .map(x -> Math.round(x * 10000) / 100.0)
                        .collect(Collectors.toList())
        );

        return modelAndView;*/
    }

}
