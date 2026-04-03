package com.example.Looose_Coupling;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("UserServiceSMS")
public class UserService {
    public NotificationService notificationService;

//    Default Construction
    public UserService() {
    }

//    Constructor
    //     Colifire Aunotation
//    @Autowired
//    public UserService(@Qualifier("emailNotificationService") NotificationService notificationService) {
//        this.notificationService = notificationService;
//    }

    @Autowired
    //  Primary Aunotation
    public UserService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyUser(String message) {
        notificationService.send("Notification hello");
    }

//    Setter Constructor
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
}
