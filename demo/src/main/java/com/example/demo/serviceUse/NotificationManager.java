package com.example.demo.serviceUse;

import com.example.demo.serviceServer.NotificationServer;
import com.example.demo.serviceImpl.notificationService.NotificationManagerGrpc;
import com.example.demo.serviceImpl.notificationService.NotificationService;
import com.example.demo.serviceUse.serviceDiscovery.ServiceDiscovery;
import com.google.protobuf.Int32Value;
import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;

import javax.jmdns.ServiceInfo;
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


    public static List<Integer> notifyUsers(List<NotificationService.Notification> notifications) throws InterruptedException {

        ManagedChannel channel = getChannel(serviceInfo);

        NotificationManagerGrpc.NotificationManagerStub stub = NotificationManagerGrpc.newStub(channel);

        StreamObserver<Int32Value> responseObserver = new StreamObserver<>() {
            @Override
            public void onNext(Int32Value value) {
                System.out.println("Value : " + value);
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

        return List.of();
    }
}
