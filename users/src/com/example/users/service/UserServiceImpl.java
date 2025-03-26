package com.example.users.service;

import com.example.users.notification.Notification;
import com.example.users.notification.NotificationFactory;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void sendNotification(String type, String message) {
        Notification notification = NotificationFactory.createNotification(type);
        notification.send(message);
    }
}
