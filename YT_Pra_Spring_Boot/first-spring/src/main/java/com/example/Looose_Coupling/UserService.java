package com.example.Looose_Coupling;

public class UserService {
    public NotificationService notificationService;

//    Default Construction
    public UserService() {
    }

    //    Constructor
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
