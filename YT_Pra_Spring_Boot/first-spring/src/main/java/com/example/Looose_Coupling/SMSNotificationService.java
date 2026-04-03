package com.example.Looose_Coupling;

public class SMSNotificationService implements NotificationService{
    @Override
    public void send(String message) {
        System.out.println("SMS : " +message);
    }

}
