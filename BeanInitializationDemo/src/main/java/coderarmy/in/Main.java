package coderarmy.in;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        ApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        // when we don't annotate something with @Lazy that means it gets created automatically default
        // when we use the lazy init then it won't create unless exlicitly stated using getbean

        OrderService os = ac.getBean(OrderService.class); // passing down the reflection of class

        os.PlaceOrder();

        // the above line calls the constructor and fetches the relevant results since its lazy it only retrieves the order service

        // @Lazy annotation can be used to solve the problem of Circular DI

    }
}