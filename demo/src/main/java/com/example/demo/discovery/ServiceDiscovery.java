package com.example.demo.discovery;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ServiceDiscovery {

    private static class SampleListener implements ServiceListener {

        private ServiceInfo serviceInfo;

        public void serviceAdded(ServiceEvent event) {
            System.out.println("Service added: " + event.getInfo());
        }


        public void serviceRemoved(ServiceEvent event) {
            System.out.println("Service removed: " + event.getInfo());
        }


        public void serviceResolved(ServiceEvent event) {
            System.out.println("Service resolved: " + event.getInfo());
            this.serviceInfo = event.getInfo();
        }

        public ServiceInfo getServiceInfo() {
            return this.serviceInfo;
        }
    }

    public static ServiceInfo discover(String type) throws InterruptedException {
        try {

            // Create a JmDNS instance
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            // Create listener
            SampleListener listener = new SampleListener();

            // Add a service listener
            jmdns.addServiceListener(type, listener);

            // Wait a bit
            Thread.sleep(1000);

            // Return service info
            return listener.getServiceInfo();

        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
            return null;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
