package com.example.users.service;

import com.example.users.notification.EmailNotification;
import com.example.users.notification.SMSNotification;
import com.example.users.notification.PushNotification;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final EmailNotification emailNotification;
    private final SMSNotification smsNotification;
    private final PushNotification pushNotification;

    public UserServiceImpl(EmailNotification emailNotification, SMSNotification smsNotification, PushNotification pushNotification) {
        this.emailNotification = emailNotification;
        this.smsNotification = smsNotification;
        this.pushNotification = pushNotification;
    }

    @Override
    public void sendNotification(String type, String message) {
        switch (type.toLowerCase()) {
            case "email":
                emailNotification.send(message);
                break;
            case "sms":
                smsNotification.send(message);
                break;
            case "push":
                pushNotification.send(message);
                break;
            default:
                throw new IllegalArgumentException("Unknown notification type: " + type);
        }
    }
}
