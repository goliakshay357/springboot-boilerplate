package com.example.users.notification;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}
