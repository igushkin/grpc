package com.example.demo.serviceUse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.jmdns.ServiceInfo;

public abstract class gRPCService {
    protected static ManagedChannel getChannel(ServiceInfo serviceInfo) {
        String host = serviceInfo.getHostAddresses()[0];
        int port = serviceInfo.getPort();

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext()
                .build();

        return channel;
    }
}
