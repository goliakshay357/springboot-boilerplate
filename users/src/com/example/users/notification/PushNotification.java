package com.example.users.notification;

import org.springframework.stereotype.Component;

@Component
public class PushNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
