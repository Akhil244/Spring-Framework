package coderarmy.in;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderService {

    // Field DI allows to eliminate starting point issue in Circular DI
    @Autowired
    private PaymentService ps;

    // the constructor is expecting a payment service object if its bean has to be created
    // it creates a difficulty to create a starting point
//    public OrderService(PaymentService ps){
//        this.ps=ps;
//    }
    // in order to resolve the starting point problem we can use either field or setter DI



    public void Placeorder(){
        ps.pay();

        // we print our details here by calling fxn
        GetOrderDetails();
        System.out.println("Order Placed!!");

    }

    public void GetOrderDetails(){
        System.out.println("Order Details!!");
    }
}
