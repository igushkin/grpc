package com.example.demo.server;

import com.example.demo.server.MyServer;

import java.io.IOException;

public class NotificationServiceServer extends MyServer {

    public static final int PORT = 50058;
    public static final String SERVICE_TYPE = "_notification._tcp.local.";
    public static final String SERVICE_NAME = "Notification service";
    public static final String SERVICE_DESCRIPTION = "Service allows to send notification to the user";

    @Override
    public void startAndRegister() throws IOException, InterruptedException {
        this.startAndRegister(SERVICE_TYPE, SERVICE_NAME, SERVICE_DESCRIPTION, PORT);
    }
}
