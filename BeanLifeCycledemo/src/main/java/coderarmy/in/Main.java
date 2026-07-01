package coderarmy.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
        // when annotated lazy unless its not created and called IOC Container is not responsible

        // it removes the relevant beans and its turned to object

//        OrderService os= ac.getBean(OrderService.class);

//        os.OrderPlace();

        CartService cs= ac.getBean(CartService.class);

        System.out.println(cs.Getvalue(1));

        cs.stop();
    }
}
