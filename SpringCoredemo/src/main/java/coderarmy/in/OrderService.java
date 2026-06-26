package coderarmy.in;

import coderarmy.in.Paymentmethod.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class OrderService {


    /* we are just providing the instance that we receive to this object instead of implementing it
    * which allows any class to implement its own responsibility instadof others
    * instead of implementing or creating instances for classes or methods which isnt its responsibility
    * here the responsibility of the Order service is to manage orders not creating instance of different class or method */

    // defining the instance of Payment Service
    // we can also perform DI using field injection as well (not recommended)
//    @Autowired
    private PaymentService ps; // we are injecting this defined field with order service

    // since we are injecting dependency of payment to Order service using constructor
    // use the annotation @Autowired to create a wiring between 2 class components


    OrderService(@Qualifier("createCard") PaymentService ps){
        this.ps=ps; // passing down the received instance
    }

    // we can also perform dependency injection inside setter method too and perform DI

//    @Autowired
//    public void setPs(PaymentService ps) {
//        this.ps = ps;
//    }

    // currently there is only one payment method so order and payment are tightly coupled
    /* in order to call method of our choice and perform loose coupling we use interfaces */


    public void Manage(){
        ps.pay();
        System.out.println("Order is initiated!!");
    }
}
