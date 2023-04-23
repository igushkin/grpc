package com.example.demo.interceptor;

import io.grpc.*;

public class MyServerInterceptor implements ServerInterceptor {
    @Override
    public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers, ServerCallHandler<ReqT, RespT> next) {
        Metadata.Key<String> loginKey = Metadata.Key.of("login", Metadata.ASCII_STRING_MARSHALLER);
        Metadata.Key<String> passwordKey = Metadata.Key.of("password", Metadata.ASCII_STRING_MARSHALLER);

        final String login = "admin";
        final String password = "123";

        boolean authorised = true;

        if (headers.get(loginKey) == null || !headers.get(loginKey).equals(login)) {
            authorised = false;
        }
        if (headers.get(passwordKey) == null || !headers.get(passwordKey).equals(password)) {
            authorised = false;
        }
        if (!authorised) {
            Status status = Status.UNAUTHENTICATED.withDescription("Wrong login or password");
            call.close(status, headers);
            return new ServerCall.Listener() {
            };
        }
        return next.startCall(call, headers);
    }
}