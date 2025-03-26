package com.example.users.controller;

import com.example.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/sendNotification")
    public String sendNotification(String type, String message) {
        userService.sendNotification(type, message);
        return "Notification sent!";
    }

    @GetMapping("/users")
    public String getUsers() {
        return "List of users";
    }
}
