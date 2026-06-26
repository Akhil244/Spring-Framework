package coderarmy.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {

       // instead of perfoming the dependency injection manually we use IOC Container provided by sprting framework

        /* there are 2 ways to do that 1) using annotations 2) using xml based config will see later */

        /* whatever the classes which we want to use spring framework treats it as beans
        * in order to create the beans we need to use @Component annotatioan near the classes which we want to access
        * in our example we are using the classes order and service so annotate it there */

        // using annotation based DI which mainly uses the interface ApplicationContext
        // in order to start the IOC container we need to pass the configurations or rules
        // to do that we pass the reflection of the Configuration class which stores the config rules

        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        // ac object currently has all the info about the components annotations
        // now since the Container is up we need to inject the dependency of payment service into order service

        OrderService or = ac.getBean(OrderService.class);
        or.Manage();

        // we are using the beans to print on console

        User u = ac.getBean(User.class);
        System.out.println(u.getName());
        System.out.println(u.getRno());
    }
}