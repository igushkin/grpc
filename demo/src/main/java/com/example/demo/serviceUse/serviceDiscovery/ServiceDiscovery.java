package com.example.demo.serviceUse.serviceDiscovery;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;

public class ServiceDiscovery {

    private final static HashMap<String, SampleListener> serviceInfo;

    static {
        serviceInfo = new HashMap<>();
    }

    public static ServiceInfo getServiceInfo(String serviceType) throws InterruptedException {

        if (serviceInfo.containsKey(serviceType)) {
            return serviceInfo.get(serviceType).getServiceInfo();
        } else {
            try {
                // Create listener
                SampleListener listener = new SampleListener();

                // Add listener to the hashmap
                serviceInfo.put(serviceType, listener);

                // Create a JmDNS instance
                JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

                // Add a service listener
                jmdns.addServiceListener(serviceType, listener);

                // Wait a bit
                Thread.sleep(1000);

                // Return service info
                return listener.getServiceInfo();

            } catch (IOException e) {
                System.out.println(e.getMessage());
                return null;
            }
        }
    }
}
