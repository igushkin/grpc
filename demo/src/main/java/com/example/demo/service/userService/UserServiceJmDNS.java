package com.example.demo.service.userService;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

import static com.example.demo.service.userService.MyJmDNS.register;

public class UserServiceJmDNS {

    private Server server;

    /*public static void main(String[] args) throws IOException, InterruptedException {
        final UserServiceJmDNS server = new UserServiceJmDNS();
        server.start();
        MyJmDNS.register();
        server.blockUntilShutdown();
    }*/

    public void start() throws IOException, InterruptedException {
        /* The port on which the server should run */
        int port = 50052;
        server = ServerBuilder.forPort(port)
                .addService(new userService.UserManagerImpl())
                .build()
                .start();

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            // Use stderr here since the logger may have been reset by its JVM shutdown hook.
            UserServiceJmDNS.this.stop();
        }));

        System.out.println("Server started on port: " + port);

        register();
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
}

class MyJmDNS {
    public static void register() throws IOException, InterruptedException {
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

        String service_type = "_http._tcp.local.";
        String service_name = "example";
        // int service_port = 1234;
        //int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;
        int service_port = 50052;
        String service_description_properties = "service_description";

        // Register a service
        ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
        jmdns.registerService(serviceInfo);

        System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);

        // Wait a bit
        Thread.sleep(1000);

        // Unregister all services
        //jmdns.unregisterAllServices();
    }
}
