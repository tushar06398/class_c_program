package Tight_Coupling;

public class UserService {
    NotificationService notificationservice = new NotificationService();
    public void notifyUser(String message) {
        notificationservice.send("Notificatin Hello");
    }
}
