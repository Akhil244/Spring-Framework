package coderarmy.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        // let's implement circular dependency injection

        // starting our IOC Container
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        OrderService or = ac.getBean(OrderService.class);
        or.Placeorder();
    }
}