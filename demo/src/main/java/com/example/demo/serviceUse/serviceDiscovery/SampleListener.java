package com.example.demo.serviceUse.serviceDiscovery;

import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;

class SampleListener implements ServiceListener {

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