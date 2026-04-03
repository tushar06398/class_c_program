package com.example.demo;

import com.example.Looose_Coupling.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("applicationBeanContext.xml");
        GreetingService greetingService
            = (GreetingService)  context.getBean("myBean");
        greetingService.sayHello();

        UserService userService
                = (UserService) context.getBean("UserServiceSMS");
        userService.notifyUser("What's up!");

        UserService userServiceEmail =
                (UserService) context.getBean("UserServiceEmail");
        userServiceEmail.notifyUser("What's up!");
    }
}
