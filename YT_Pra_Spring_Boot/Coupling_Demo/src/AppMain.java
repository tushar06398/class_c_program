import Looose_Coupling.EmailNotificationService;
import Looose_Coupling.NotificationService;
import Looose_Coupling.SMSNotificationService;
import Tight_Coupling.UserService;

public class AppMain {
    public static void main(String[] args) {

        //Tight
        UserService userService = new UserService();
        userService.notifyUser("Order Placed");

        //Loose
        NotificationService emailService = new EmailNotificationService();
//        NotificationService smsService = new SMSNotificationService();

//             Constructor Injection
        Looose_Coupling.UserService userServiceLoose = new Looose_Coupling.UserService(emailService);
//        Looose_Coupling.UserService smsServiceLoose = new Looose_Coupling.UserService(smsService);

        userServiceLoose.notifyUser("Order Processed!");
//        smsServiceLoose.notifyUser("Order Packed!");

//          Setter Injection
        Looose_Coupling.UserService userServiceLooseSetter
                = new Looose_Coupling.UserService();
        userServiceLooseSetter.setNotificationService(emailService);

//        Field Injection
        userServiceLooseSetter.notificationService = emailService;
    }
}
