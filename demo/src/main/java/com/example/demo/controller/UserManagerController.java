package com.example.demo.controller;

import com.example.demo.service.meetingService.*;
import com.example.demo.service.userService.*;
import com.google.protobuf.*;
import com.example.demo.discovery.ServiceDiscovery;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user-manager")
public class UserManagerController {

    private ServiceInfo userService;

    public UserManagerController() throws InterruptedException {
        userService = ServiceDiscovery.discover("_http._tcp.local.");
    }

    @GetMapping
    public ModelAndView userManager() {
        ModelAndView modelAndView = new ModelAndView("userService/methodsMenu.html");
        return modelAndView;
    }

    // Service 1. Method 1
    // Get all users (server stream)
    @GetMapping("/users")
    public ModelAndView getAllUsers() {

        ManagedChannel channel = getChannel(userService);
        List<UserService.User> users = getUsers(channel);

        ModelAndView modelAndView = new ModelAndView("userService/getAllUsers.html");
        modelAndView.addObject("model", users);
        return modelAndView;
    }

    // Service 1. Method 2
    // Add new user (unary request)
    @GetMapping("/create-form")
    public ModelAndView addUser() {
        ModelAndView modelAndView = new ModelAndView("userService/addUser.html");
        return modelAndView;
    }

    // Service 1. Method 2
    // Add new user (unary request)
    @PostMapping("/create-form")
    public ModelAndView saveUser(@RequestBody MultiValueMap<String, String> formData) {

        UserService.User newUser = UserService.User.newBuilder()
                .setId(Integer.parseInt(formData.getFirst("id")))
                .setName(formData.getFirst("name"))
                .setEmail(formData.getFirst("email"))
                .setPhoneNumber(formData.getFirst("phoneNumber"))
                .setDeviceID(formData.getFirst("deviceID"))
                .build();

        ManagedChannel channel = getChannel(userService);
        UserManagerGrpc.UserManagerBlockingStub blockingStub = UserManagerGrpc.newBlockingStub(channel);
        blockingStub.addUser(newUser);

        ModelAndView modelAndView = new ModelAndView("userService/addUser.html");
        return modelAndView;
    }

    private ManagedChannel getChannel(ServiceInfo serviceInfo) {
        String host = serviceInfo.getHostAddresses()[0];
        int port = serviceInfo.getPort();

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext()
                .build();

        return channel;
    }

    private List<UserService.User> getUsers(ManagedChannel channel) {
        UserManagerGrpc.UserManagerBlockingStub blockingStub = UserManagerGrpc.newBlockingStub(channel);
        List<UserService.User> users = new ArrayList<>();
        Iterator<UserService.User> itr = blockingStub.findUser(StringValue.newBuilder().build());
        itr.forEachRemaining(users::add);

        return users;
    }

    private List<MeetingService.Meeting> getMeetings(ManagedChannel channel, int userID) {
        MeetingManagerGrpc.MeetingManagerBlockingStub blockingStub = MeetingManagerGrpc.newBlockingStub(channel);
        List<MeetingService.Meeting> meetings = new ArrayList<>();
        Iterator<MeetingService.Meeting> itr = blockingStub.getUserMeetings(Int32Value.newBuilder().setValue(userID).build());
        itr.forEachRemaining(meetings::add);

        return meetings;
    }

    private int addMeeting(ManagedChannel channel, MeetingService.Meeting meeting) {
        MeetingManagerGrpc.MeetingManagerBlockingStub blockingStub = MeetingManagerGrpc.newBlockingStub(channel);
        return blockingStub.bookMeeting(meeting).getValue();
    }

}