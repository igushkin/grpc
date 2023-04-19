package com.example.demo.server;

import com.example.demo.server.MyServer;

import java.io.IOException;


public class MeetingServiceServer extends MyServer {

    public static final int PORT = 50053;
    public static final String SERVICE_TYPE = "_meeting._tcp.local.";
    public static final String SERVICE_NAME = "Meeting service";
    public static final String SERVICE_DESCRIPTION = "Service allows register new meetings";

    @Override
    public void startAndRegister() throws IOException, InterruptedException {
        this.startAndRegister(SERVICE_TYPE, SERVICE_NAME, SERVICE_DESCRIPTION, PORT);
    }
}