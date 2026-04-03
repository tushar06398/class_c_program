package com.example.demo;

import com.example.Looose_Coupling.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);
//        GreetingService greetingService
//            = (GreetingService)  context.getBean("myBean");
        GreetingService greetingService
            = context.getBean(GreetingService.class);
        greetingService.sayHello();

        UserService userService
                = (UserService) context.getBean(UserService.class);
        userService.notifyUser("What's up!");

//        UserService userServiceEmail =
//                (UserService) context.getBean("UserServiceEmail");
//        userServiceEmail.notifyUser("What's up!");
    }
}
