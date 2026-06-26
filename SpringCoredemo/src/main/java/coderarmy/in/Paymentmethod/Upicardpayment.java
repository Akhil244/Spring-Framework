package coderarmy.in.Paymentmethod;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// since interface can help implememt as well as override the methods
// IOC Container gets confused and might lead to confusion of which method to call
// in order to ensure that the confusion resolves

// use annotation @Primary when we are sure that this is the first main priority

// since the upi is our priority of payment we write the above annotation for it

// if we cant decide which one to give priority to then we can use the annotation @Qualifier

// Syntax : @Qualifier("class_name_in_camel_case") near the place where the DI is taking place

@Component

public class Upicardpayment implements PaymentService {

    @Override
    public void pay(){
        System.out.println("Payment via UPI Card");
    }
}
