package coderarmy.in.Paymentmethod;

import org.springframework.stereotype.Component;


public interface PaymentService{

    // we write the pay method which is implemented by others
    // we aminly use this interface to ensure loose coupling

    public void pay();
}