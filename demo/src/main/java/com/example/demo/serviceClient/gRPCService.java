package com.example.demo.serviceClient;

import com.example.demo.interceptor.MyClientInterceptor;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.jmdns.ServiceInfo;

public abstract class gRPCService {
    protected static ManagedChannel getChannel(ServiceInfo serviceInfo) {
        String host = serviceInfo.getHostAddresses()[0];
        int port = serviceInfo.getPort();

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(host, port)
                .intercept(new MyClientInterceptor())
                .usePlaintext()
                .build();

        return channel;
    }
}
