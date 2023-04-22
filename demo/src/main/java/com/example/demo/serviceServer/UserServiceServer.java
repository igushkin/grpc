package com.example.demo.serviceServer;

import com.example.demo.serviceImpl.userService.UserManagerImpl;

import java.io.IOException;

public class UserServiceServer extends MyServer {

    public static final int PORT = 50052;
    public static final String SERVICE_TYPE = "_user._tcp.local.";
    public static final String SERVICE_NAME = "User service";
    public static final String SERVICE_DESCRIPTION = "Service allows to manage users";

    @Override
    public void startAndRegister() throws IOException, InterruptedException {
        this.startAndRegister(new UserManagerImpl(), SERVICE_TYPE, SERVICE_NAME, SERVICE_DESCRIPTION, PORT);
    }
}