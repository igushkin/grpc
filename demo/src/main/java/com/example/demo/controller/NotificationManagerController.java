package com.example.demo.controller;

import com.example.demo.serviceUse.NotificationManager;
import com.example.demo.serviceUse.UserManager;
import com.example.demo.serviceImpl.notificationService.NotificationService;
import com.example.demo.serviceImpl.userService.UserService;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/notification-manager")
public class NotificationManagerController {

    @GetMapping("")
    public ModelAndView notificationManager() {
        ModelAndView modelAndView = new ModelAndView("notificationService/serviceMenu.html");
        return modelAndView;
    }

    @GetMapping("/notify")
    public ModelAndView notifyUsers() {
        List<UserService.User> users = UserManager.getAllUsers();
        ModelAndView modelAndView = new ModelAndView("notificationService/method/sendNotification.html");
        modelAndView.addObject("users", users);

        return modelAndView;
    }

    @PostMapping("/notify")
    public ModelAndView notifyUsers(@RequestBody MultiValueMap<String, String> formData) throws InterruptedException {

        List<String> userEmails = formData.get("userEmails");
        String subject = formData.getFirst("subject");
        String message = formData.getFirst("message");


        List<NotificationService.Notification> notifications = new ArrayList<>();

        for (String userEmail : userEmails) {
            notifications.add(NotificationService.Notification
                    .newBuilder()
                    .setUserID(1)
                    .setUserEmail(userEmail)
                    .setSubject(subject)
                    .setMsg(message)
                    .build());
        }

        NotificationManager.notifyUsers(notifications);

        Thread.sleep(100);
        return null;
    }
}
