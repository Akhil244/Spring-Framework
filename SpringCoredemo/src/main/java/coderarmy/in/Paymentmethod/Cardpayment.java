package coderarmy.in.Paymentmethod;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


public class Cardpayment implements PaymentService{

    @Override
    @Primary
    public void pay(){
        System.out.println("Payment via Credit card");
    }
}
