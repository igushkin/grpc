package com.example.demo.controller;

import com.example.demo.discovery.ServiceDiscovery;
import com.example.demo.service.meetingService.MeetingManagerGrpc;
import com.example.demo.service.meetingService.MeetingService;
import com.example.demo.service.userService.UserManagerGrpc;
import com.example.demo.service.userService.UserService;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import com.google.protobuf.Timestamp;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jmdns.ServiceInfo;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/meeting-manager")
public class MeetingManagerController {

    private ServiceInfo userService;
    private ServiceInfo meetingService;
    private ServiceInfo service3;

    public MeetingManagerController() throws InterruptedException {
        userService = ServiceDiscovery.discover("_http._tcp.local.");
        meetingService = ServiceDiscovery.discover("_meeting._tcp.local.");
    }

    @GetMapping()
    public ModelAndView meetingManager() {
        ModelAndView modelAndView = new ModelAndView("meetingService/methodsMenu.html");
        return modelAndView;
    }

    /*
        @GetMapping("/user-manager")
        public ModelAndView userManager() {
            ModelAndView modelAndView = new ModelAndView("service1/methodsMenu.html");
            return modelAndView;
        }

        // Service 1. Method 1
        // Get all users (server stream)
        @GetMapping("/users")
        public ModelAndView getAllUsers() {

            ManagedChannel channel = getChannel(userService);
            List<UserService.User> users = getUsers(channel);

            ModelAndView modelAndView = new ModelAndView("service1/getAllUsers.html");
            modelAndView.addObject("model", users);
            return modelAndView;
        }

        // Service 1. Method 2
        // Add new user (unary request)
        @GetMapping("/user-manager/create-form")
        public ModelAndView addUser() {
            ModelAndView modelAndView = new ModelAndView("service1/addUser.html");
            return modelAndView;
        }

        // Service 1. Method 2
        // Add new user (unary request)
        @PostMapping("/users/form")
        public ModelAndView saveUser(@RequestBody MultiValueMap<String, String> formData) {

            UserService.User newUser = UserService.User.newBuilder()
                    .setName(formData.getFirst("name"))
                    .setEmail(formData.getFirst("email"))
                    .setPhoneNumber(formData.getFirst("phoneNumber"))
                    .setDeviceID(formData.getFirst("deviceID"))
                    .build();

            ManagedChannel channel = getChannel(userService);
            UserManagerGrpc.UserManagerBlockingStub blockingStub = UserManagerGrpc.newBlockingStub(channel);
            blockingStub.addUser(newUser);

            ModelAndView modelAndView = new ModelAndView("service1/addUser.html");
            return modelAndView;
        }
    */

    // Service 2. Method 1
    // Get user's meetings (server stream)
    @GetMapping("/meetings")
    public ModelAndView getUserMeetings(@RequestParam(value = "userID", required = false) Integer userID) {

        List<UserService.User> users = getUsers(getChannel(userService));
        ModelAndView modelAndView = new ModelAndView("meetingService/userMeetings.html");
        modelAndView.addObject("users", users);

        if (userID != null) {

            UserService.User user = users.stream().filter(x -> x.getId() == userID).findFirst().get();

            List<LocalDateTime> meetingDates = getMeetings(getChannel(meetingService), userID)
                    .stream().map(x -> Instant.ofEpochSecond(x.getTime().getSeconds()).atZone(ZoneId.systemDefault()).toLocalDateTime())
                    .collect(Collectors.toList());

            modelAndView.addObject("userName", user.getName());
            modelAndView.addObject("meetings", meetingDates);
        }

        return modelAndView;
    }

    // Service 2. Book appointment
    // Step 2. Select meeting date
    @GetMapping("/create-form")
    public ModelAndView addMeeting(@RequestParam(value = "userID", required = false) Integer userID) {

        List<UserService.User> users = getUsers(getChannel(userService));
        ModelAndView modelAndView = new ModelAndView("meetingService/addNewMeeting.html");
        modelAndView.addObject("users", users);

        if (userID != null) {

            UserService.User user = users.stream().filter(x -> x.getId() == userID).findFirst().get();

            modelAndView.addObject("userName", user.getName());
            modelAndView.addObject("userID", userID);

        }

        return modelAndView;
    }

    // Service 2. Method 2
    // Add new meeting (unary request)
    @PostMapping("/create-form")
    public ModelAndView saveMeeting(@RequestBody MultiValueMap<String, String> formData) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime date = LocalDateTime.parse(formData.getFirst("meetingDate") + " " + formData.getFirst("appt"), formatter);
        int userID = Integer.parseInt(formData.getFirst("userID"));
        String userName = formData.getFirst("userName");

        MeetingService.Meeting meeting = MeetingService.Meeting
                .newBuilder()
                .setTime(Timestamp.newBuilder().setSeconds(date.atZone(ZoneId.systemDefault()).toEpochSecond()))
                .setUserName(userName)
                .setUserId(userID)
                .build();

        addMeeting(getChannel(meetingService), meeting);

        List<UserService.User> users = getUsers(getChannel(userService));
        ModelAndView modelAndView = new ModelAndView("meetingService/addNewMeeting.html");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

/*
    // Service 2. Book appointment
    // Step 3. Save meeting
    @PostMapping("/appointment")
    public ModelAndView addMeeting(@RequestBody MultiValueMap<String, String> formData) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        LocalDateTime date = LocalDateTime.parse(formData.getFirst("meetingDate") + " " + formData.getFirst("appt"), formatter);

        System.out.println();


        ManagedChannel channel1 = getChannel(userService);
        //stubs -- generate from proto
        UserManagerGrpc.UserManagerBlockingStub blockingStub1 = UserManagerGrpc.newBlockingStub(channel1);

        List<UserService.User> list1 = new ArrayList<>();
        Iterator<UserService.User> users = blockingStub1.findUser(StringValue.newBuilder().build());
        users.forEachRemaining(list1::add);
        UserService.User user = list1.get(0);

        MeetingService.Meeting meeting = MeetingService.Meeting
                .newBuilder()
                .setTime(Timestamp.newBuilder().setSeconds(date.atZone(ZoneId.systemDefault()).toEpochSecond()))
                .setUserName(user.getName())
                .setUserId(user.getId())
                .build();


        ManagedChannel channel = getChannel(meetingService);

        //stubs -- generate from proto
        MeetingManagerGrpc.MeetingManagerBlockingStub blockingStub = MeetingManagerGrpc.newBlockingStub(channel);

        blockingStub.bookMeeting(meeting);

        return null;
    }
*/
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
