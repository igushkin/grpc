package com.example.demo.server;

import com.example.demo.jmDNS.MyJmDNS;
import com.example.demo.service.userService.UserManagerImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public abstract class MyServer {
    private Server server;

    public abstract void startAndRegister() throws IOException, InterruptedException;

    protected void startAndRegister(String serviceType, String serviceName, String serviceDescription, int port) throws IOException, InterruptedException {
        /* The port on which the server should run */
        server = ServerBuilder.forPort(port)
                .addService(new UserManagerImpl())
                .build()
                .start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            // Use stderr here since the logger may have been reset by its JVM shutdown hook.
            this.stop();
        }));

        System.out.println("Server started on port: " + port);

        MyJmDNS.register(serviceType, serviceName, serviceDescription, port);
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }
}
