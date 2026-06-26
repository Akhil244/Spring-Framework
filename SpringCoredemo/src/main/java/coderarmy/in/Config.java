package coderarmy.in;

// since we are defining the configurations relevant to the IOC Container here
// use the annotation @Configuration to tell spring that all the configurations are defined here
// in order to access all the relevant components in the package or sub packages
// use the annotation @componentscan

import coderarmy.in.Paymentmethod.Cardpayment;
import coderarmy.in.Paymentmethod.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("coderarmy.in")
public class Config {
    // writing the other configurations here
    // in order to call any bean we need to use the annotation @Bean
    // stores the objects which are returned by any method inside IOC Container

    // defining our config methods of custom-type classes
    @Bean
    public User setfields(){
        return new User("Akhil",55);
    }

    // we can also pass the payment method and perform DI by creating our custom bean
    // in this case we are passing down the credit card payment method inside payment service bean
    @Bean
    public PaymentService createCard(){
        return new Cardpayment();
    }
    @Bean
    public OrderService createOrder(@Qualifier("createCard") PaymentService ps) {
        return new OrderService(ps);
    }
}
