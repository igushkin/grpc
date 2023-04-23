package com.example.demo.interceptor;

import io.grpc.*;

public class MyClientInterceptor implements ClientInterceptor {
    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
        return new ForwardingClientCall.SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {
            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                headers.put(Metadata.Key.of("login", Metadata.ASCII_STRING_MARSHALLER), "admin");
                headers.put(Metadata.Key.of("password", Metadata.ASCII_STRING_MARSHALLER), "123");
                super.start(responseListener, headers);
            }
        };
    }
}