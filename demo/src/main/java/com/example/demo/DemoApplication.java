package com.example.demo;

import com.example.demo.service.userService.UserService;
import com.example.demo.service.userService.UserServiceJmDNS;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Start and register service 1
        UserServiceJmDNS a = new UserServiceJmDNS();
        a.start();

        //a.blockUntilShutdown();
        SpringApplication.run(DemoApplication.class, args);
    }

}
