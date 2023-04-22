package com.example.demo.controller;

import com.example.demo.serviceUse.MeetingManager;
import com.example.demo.serviceUse.UserManager;
import com.example.demo.serviceImpl.meetingService.*;
import com.example.demo.serviceImpl.userService.*;
import com.google.protobuf.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/meeting-manager")
public class MeetingManagerController {

    @GetMapping()
    public ModelAndView meetingManager() {
        ModelAndView modelAndView = new ModelAndView("meetingService/serviceMenu.html");
        return modelAndView;
    }

    // Get user's meetings (server stream)
    @GetMapping("/meetings")
    public ModelAndView getUserMeetings(@RequestParam(value = "userID", required = false) Integer userID) {

        List<UserService.User> users = UserManager.getAllUsers();
        ModelAndView modelAndView = new ModelAndView("meetingService/method/getUserMeetings.html");
        modelAndView.addObject("users", users);

        if (userID != null) {

            UserService.User user = users.stream().filter(x -> x.getId() == userID).findFirst().get();

            List<String> meetingDates = MeetingManager.getUserMeetings(userID)
                    .stream()
                    .map(x -> Instant.ofEpochSecond(x.getTime().getSeconds()).atZone(ZoneId.systemDefault()).toLocalDateTime())
                    .sorted()
                    .map(x -> x.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")))
                    .collect(Collectors.toList());

            modelAndView.addObject("userName", user.getName());
            modelAndView.addObject("meetings", meetingDates);
        }

        return modelAndView;
    }

    // Add meeting (unary request)
    @GetMapping("/create-form")
    public ModelAndView addMeeting(@RequestParam(value = "userID", required = false) Integer userID) {

        List<UserService.User> users = UserManager.getAllUsers();
        ModelAndView modelAndView = new ModelAndView("meetingService/method/addNewMeeting.html");
        modelAndView.addObject("users", users);

        if (userID != null) {

            UserService.User user = users.stream().filter(x -> x.getId() == userID).findFirst().get();

            modelAndView.addObject("userName", user.getName());
            modelAndView.addObject("userID", userID);

        }

        return modelAndView;
    }

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

        MeetingManager.addMeeting(meeting);

        List<UserService.User> users = UserManager.getAllUsers();
        ModelAndView modelAndView = new ModelAndView("meetingService/method/addNewMeeting.html");
        modelAndView.addObject("users", users);
        return modelAndView;
    }

    @GetMapping("/report")
    public ModelAndView getReport() throws InterruptedException {
        List<UserService.User> users = UserManager.getAllUsers();
        MeetingService.Report report = MeetingManager.getReport(List.of(1, 2, 3));


        ModelAndView modelAndView = new ModelAndView("meetingService/method/notImplemented.html");
        modelAndView.addObject("numOfMeetings", report.getNumOfMeetings());

        Map<String, Double> statByUser = report
                .getStatByUserMap()
                .entrySet()
                .stream()
                .map(x -> Map.entry(users.stream().filter(u -> u.getId() == x.getKey()).findFirst().get().getName(), Math.round(x.getValue() * 10000) / 100.0))
                .collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));

        modelAndView.addObject("statByUser", statByUser);

        modelAndView.addObject("statByDay",
                report.getStatByDayOfTheWeekMap()
                        .values()
                        .stream()
                        .map(x -> Math.round(x * 10000) / 100.0)
                        .collect(Collectors.toList())
        );

        return modelAndView;
    }
}
