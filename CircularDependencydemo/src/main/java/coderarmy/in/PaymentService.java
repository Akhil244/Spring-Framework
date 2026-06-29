package coderarmy.in;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    // to implement the circular dependency injection which dependencies relate to each other
    // we need to create the instance of OrderService here and pass it inside the PS constructor

    private OrderService os;

    // the payment service bean will be created only if the orderservice instance is passed

    // since order and payment service is interdependent on each other IOC Container struggles
    // the priority between 2 dependencies seems to collide which creates difficulty to Identify a starting point
    // this is called circular dependency

    public PaymentService(OrderService os){
        this.os=os;
    }

    public void pay(){
        System.out.println("Payment done!!");
        // violates the SOLID Principles
        // its responsibility is to just pay and nothing else
        //os.GetOrderDetails();
    }
}
