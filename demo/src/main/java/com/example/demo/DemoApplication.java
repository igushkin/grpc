package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException {
        /*
        // Start and register service 1
        UserServiceJmDNS a = new UserServiceJmDNS();
        a.start();

        MeetingServiceJmDNS b = new MeetingServiceJmDNS();
        b.start();

        //a.blockUntilShutdown();*/
        SpringApplication.run(DemoApplication.class, args);
    }

}
