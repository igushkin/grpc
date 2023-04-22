package com.example.demo.serviceUse;

import com.example.demo.serviceServer.UserServiceServer;
import com.example.demo.serviceImpl.userService.UserManagerGrpc;
import com.example.demo.serviceImpl.userService.UserService;
import com.example.demo.serviceUse.serviceDiscovery.ServiceDiscovery;
import com.google.protobuf.StringValue;
import io.grpc.ManagedChannel;

import javax.jmdns.ServiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserManager extends gRPCService {
    private final static ServiceInfo serviceInfo;

    static {
        try {
            serviceInfo = ServiceDiscovery.getServiceInfo(UserServiceServer.SERVICE_TYPE);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static int addUser(UserService.User user) {
        ManagedChannel channel = getChannel(serviceInfo);
        UserManagerGrpc.UserManagerBlockingStub blockingStub = UserManagerGrpc.newBlockingStub(channel);
        blockingStub.addUser(user);
        return user.getId();
    }

    public static List<UserService.User> getAllUsers() {
        ManagedChannel channel = getChannel(serviceInfo);
        UserManagerGrpc.UserManagerBlockingStub blockingStub = UserManagerGrpc.newBlockingStub(channel);
        List<UserService.User> users = new ArrayList<>();
        Iterator<UserService.User> itr = blockingStub.findUser(StringValue.newBuilder().build());
        itr.forEachRemaining(users::add);

        return users;
    }
}
