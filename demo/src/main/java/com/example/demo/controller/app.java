package com.example.demo.controller;

import com.example.demo.service.userService.UserManagerGrpc;
import com.example.demo.service.userService.UserService;
import com.google.protobuf.StringValue;
import com.example.demo.discovery.ServiceDiscovery;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/")
public class app {

    //private ServiceInfo mathServiceInfo;

    private ServiceInfo service1;
    private ServiceInfo service2;
    private ServiceInfo service3;

    public app() throws InterruptedException {
        service1 = ServiceDiscovery.discover("_http._tcp.local.");
    }

    @GetMapping
    public ModelAndView index() throws IOException, InterruptedException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index.html");
        return modelAndView;
    }

    @GetMapping("/user")
    public ModelAndView findUser(@RequestParam(value = "name", defaultValue = "", required = false) String name) {
        String host = service1.getHostAddresses()[0];
        int port = service1.getPort();

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext()
                .build();

        //stubs -- generate from proto
        UserManagerGrpc.UserManagerBlockingStub blockingStub = UserManagerGrpc.newBlockingStub(channel);

        Iterator<UserService.User> itr = blockingStub.findUser(StringValue.newBuilder().setValue(" ").build());

        List<UserService.User> list = new ArrayList<>();

        while (itr.hasNext()) {
            UserService.User user = itr.next();
            list.add(user);
            System.out.println(user.getId());
        }

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("form.html");
        modelAndView.addObject("model", list);
        return modelAndView;
    }

    @GetMapping("/user/add")
    public ModelAndView addUser() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addUser.html");
        return modelAndView;
    }

    @PostMapping("/user/add")
    public ModelAndView saveUser(@RequestBody MultiValueMap<String, String> formData) {

        UserService.User newUser = UserService.User.newBuilder()
                .setName(formData.getFirst("name"))
                .setEmail(formData.getFirst("email"))
                .setPhoneNumber(formData.getFirst("phoneNumber"))
                .setDeviceID(formData.getFirst("deviceID"))
                .build();


        String host = service1.getHostAddresses()[0];
        int port = service1.getPort();

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext()
                .build();

        //stubs -- generate from proto
        UserManagerGrpc.UserManagerBlockingStub blockingStub = UserManagerGrpc.newBlockingStub(channel);

        blockingStub.addUser(newUser);


        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("addUser.html");
        return modelAndView;
    }

    // Book appointment
    @GetMapping("/appointment")
    public ModelAndView bookAppointment(@RequestParam(value = "id", defaultValue = "-1", required = false) Integer id) {
        if (id == -1) {
            String host = service1.getHostAddresses()[0];
            int port = service1.getPort();

            ManagedChannel channel = ManagedChannelBuilder
                    .forAddress(host, port)
                    .usePlaintext()
                    .build();

            //stubs -- generate from proto
            UserManagerGrpc.UserManagerBlockingStub blockingStub = UserManagerGrpc.newBlockingStub(channel);

            Iterator<UserService.User> itr = blockingStub.findUser(StringValue.newBuilder().setValue(" ").build());

            List<UserService.User> list = new ArrayList<>();

            while (itr.hasNext()) {
                UserService.User user = itr.next();

                list.add(user);
                System.out.println(user.getId());
            }

            ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("bookAppointment");
            modelAndView.addObject("users", list);
            return modelAndView;

        } else {
            return null;
        }
    }

    // Remove appointment
}
