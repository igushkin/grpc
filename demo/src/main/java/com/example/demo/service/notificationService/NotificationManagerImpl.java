package com.example.demo.service.notificationService;

import com.google.protobuf.Int32Value;
import io.grpc.stub.StreamObserver;

public class NotificationManagerImpl extends NotificationManagerGrpc.NotificationManagerImplBase {
    @Override
    public StreamObserver<NotificationService.Notification> sendNotification(StreamObserver<Int32Value> responseObserver) {
        return super.sendNotification(responseObserver);
    }
}
