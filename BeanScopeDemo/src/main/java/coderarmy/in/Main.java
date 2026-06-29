package coderarmy.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        OrderService od = ac.getBean(OrderService.class);
        OrderService od2 = ac.getBean(OrderService.class);

        System.out.println(od==od2); // both point to same reference
    }
}
