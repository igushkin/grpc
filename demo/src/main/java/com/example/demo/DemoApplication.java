package com.example.demo;


import com.example.demo.serviceServer.MeetingServiceServer;
import com.example.demo.serviceServer.NotificationServer;
import com.example.demo.serviceServer.UserServiceServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Start and register services
        UserServiceServer a = new UserServiceServer();
        a.startAndRegister();

        MeetingServiceServer b = new MeetingServiceServer();
        b.startAndRegister();

        NotificationServer c = new NotificationServer();
        c.startAndRegister();

        SpringApplication.run(DemoApplication.class, args);
    }
}
