package com.example.demo.controller;

import com.example.demo.serviceImpl.userService.*;
import com.example.demo.serviceClient.UserManager;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@RestController
@RequestMapping("/user-manager")
public class UserManagerController {

    @GetMapping
    public ModelAndView userManager() {
        ModelAndView modelAndView = new ModelAndView("userService/serviceMenu.html");
        return modelAndView;
    }

    // Get all users (server stream)
    @GetMapping("/users")
    public ModelAndView getAllUsers() {

        List<UserService.User> users = UserManager.getAllUsers();

        ModelAndView modelAndView = new ModelAndView("userService/method/getAllUsers.html");
        modelAndView.addObject("model", users);
        return modelAndView;
    }

    // Add new user (unary request)
    @GetMapping("/create-form")
    public ModelAndView addUser() {
        ModelAndView modelAndView = new ModelAndView("userService/method/addUser.html");
        return modelAndView;
    }

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

            UserManager.addUser(newUser);

            ModelAndView modelAndView = new ModelAndView("userService/method/addUser.html");
            return modelAndView;

    }

    // Update user (unary request)
    @GetMapping("/update-form")
    public ModelAndView updateUser() {
        ModelAndView modelAndView = new ModelAndView("userService/method/updateUser.html");
        return modelAndView;
    }

    // Update user (unary request)
    @PostMapping("/update-form")
    public ModelAndView updateUser(@RequestBody MultiValueMap<String, String> formData) {

        UserService.User newUser = UserService.User.newBuilder()
                .setId(Integer.parseInt(formData.getFirst("id")))
                .setName(formData.getFirst("name"))
                .setEmail(formData.getFirst("email"))
                .setPhoneNumber(formData.getFirst("phoneNumber"))
                .setDeviceID(formData.getFirst("deviceID"))
                .build();


        UserManager.updateUser(newUser);

        ModelAndView modelAndView = new ModelAndView("userService/method/updateUser.html");
        return modelAndView;
    }
}