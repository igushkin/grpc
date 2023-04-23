package com.example.demo.serviceClient;

import com.example.demo.serviceServer.NotificationServer;
import com.example.demo.serviceImpl.notificationService.NotificationManagerGrpc;
import com.example.demo.serviceImpl.notificationService.NotificationService;
import com.example.demo.serviceClient.serviceDiscovery.ServiceDiscovery;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Int32Value;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;

import javax.jmdns.ServiceInfo;
import java.util.ArrayList;
import java.util.List;

public class NotificationManager extends gRPCService {
    private final static ServiceInfo serviceInfo;

    static {
        try {
            serviceInfo = ServiceDiscovery.getServiceInfo(NotificationServer.SERVICE_TYPE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int turnOnNotifications(int userID) {
        ManagedChannel channel = getChannel(serviceInfo);
        NotificationManagerGrpc.NotificationManagerBlockingStub blockingStub = NotificationManagerGrpc.newBlockingStub(channel);
        blockingStub.turnOnNotifications(Int32Value.newBuilder().setValue(userID).build());
        return userID;
    }

    public static int turnOffNotifications(int userID) {
        ManagedChannel channel = getChannel(serviceInfo);
        NotificationManagerGrpc.NotificationManagerBlockingStub blockingStub = NotificationManagerGrpc.newBlockingStub(channel);
        blockingStub.turnOffNotifications(Int32Value.newBuilder().setValue(userID).build());
        return userID;
    }

    public static List<Boolean> notifyUsers(List<NotificationService.Notification> notifications) throws InterruptedException {

        List<Boolean> response = new ArrayList<>();
        ManagedChannel channel = getChannel(serviceInfo);
        NotificationManagerGrpc.NotificationManagerStub stub = NotificationManagerGrpc.newStub(channel);

        StreamObserver<BoolValue> responseObserver = new StreamObserver<>() {
            @Override
            public void onNext(BoolValue value) {
                response.add(value.getValue());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Finish : ");
            }
        };

        StreamObserver<NotificationService.Notification> observer = stub.sendNotification(responseObserver);

        for (NotificationService.Notification notification : notifications) {
            observer.onNext(notification);
        }

        observer.onCompleted();

        Thread.sleep(100);

        return response;
    }

}
