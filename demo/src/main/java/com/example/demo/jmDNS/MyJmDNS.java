package com.example.demo.jmDNS;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class MyJmDNS {
    public static void register(String service_type, String service_name, String service_description, int service_port) throws IOException, InterruptedException {
        JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

        // Register a service
        ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description);
        jmdns.registerService(serviceInfo);

        System.out.printf("Registering service with type %s and name %s \n", service_type, service_name);

        // Wait a bit
        Thread.sleep(1000);
    }
}
