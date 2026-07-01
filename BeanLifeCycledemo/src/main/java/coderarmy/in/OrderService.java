package coderarmy.in;

import org.springframework.stereotype.Component;

@Component
public class OrderService {

    private PaymentService ps;

    OrderService(PaymentService ps){
        this.ps=ps;
    }

    public void OrderPlace(){
        System.out.println("Order placed");

        ps.pay();
    }
}
