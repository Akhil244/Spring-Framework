package coderarmy.in;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy
public class OrderService {

    private PaymentService ps;

    // near order service constructor we are trying to inject a proxy which is similar to payment service
    // first the order service is created then place order method is called since the payment method is called
    // method of payment service is called and then payment will be done and order details will be shared

    public OrderService(@Lazy PaymentService ps){
//        System.out.println("Order service created");
        this.ps=ps;
    }

    public void PlaceOrder(){
        ps.pay();
        System.out.println("Order Placed");
    }

    public void Getdetails(){
        System.out.println("Order Details");
    }
}