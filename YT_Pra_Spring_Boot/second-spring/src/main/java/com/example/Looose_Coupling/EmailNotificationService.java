package com.example.Looose_Coupling;

import org.springframework.stereotype.Component;

@Component
public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("Email : " +message);
    }

}
