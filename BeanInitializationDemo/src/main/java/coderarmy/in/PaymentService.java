package coderarmy.in;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy  // we annotate this when we don't want our Bean to only be created when it is asked not by default

public class PaymentService {

    private OrderService os;

    public PaymentService(OrderService os){
//        System.out.println("Payment service created");
        this.os=os;
    }

    public void pay(){

        System.out.println("Payment Done");

        os.Getdetails();
    }
}
