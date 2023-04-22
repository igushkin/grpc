package com.example.demo.serviceServer;

import com.example.demo.serviceImpl.notificationService.NotificationManagerImpl;

import java.io.IOException;

public class NotificationServer extends MyServer {

    public static final int PORT = 50058;
    public static final String SERVICE_TYPE = "_notification._tcp.local.";
    public static final String SERVICE_NAME = "Notification service";
    public static final String SERVICE_DESCRIPTION = "Service allows to send notification to the user";

    @Override
    public void startAndRegister() throws IOException, InterruptedException {
        this.startAndRegister(new NotificationManagerImpl(), SERVICE_TYPE, SERVICE_NAME, SERVICE_DESCRIPTION, PORT);
    }
}
