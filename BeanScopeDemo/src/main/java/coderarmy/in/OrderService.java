package coderarmy.in;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton") // creates Order Service in IOC Container
//@Scope("prototype") // doesn't create Order Service in IOC Container only creates if asked

// since we used 2 objects in main so 2 times our constructor is called and object is created
// in singleton its created only once and its passed everytime to any object which asks for it
// singleton does eager init and prototype is lazy init
// the reference in singleton is same for all objects whereas it's different for prototype

public class OrderService {

    public OrderService(){
        System.out.println("order service is created");
    }

    public void Placeorder(){
        System.out.println("Order placed");
    }
}
