package org.example;

import org.example.notifications.NotificationService;

public class Orderservice {

    // in this simple order application we just recieve the instance of the object
    // instead of creating the object ourselves we prefer the usage of SOLID Principles

    /* Single responsibility principle which tell
     a class must have single responsibility to change

     Open closed principle which tells that a class should be open for extension
     but remain closed for modification for which we can use wither interface
     or we can also use inheritance concept which extends multiple classes

     which can be used for adding useful multiple features and avoids modification of methods

     here in our implementation the orderservice is only responsible for
     implementing the order placing only and it just recieves notification
     it doesn't implement the notification or create notification we might impact
     during unit testing as well as it breaks SOLID Principles

     */

    NotificationService notify;

    // we use constructors since we want to recieve notification
    public Orderservice(NotificationService notify){
        this.notify=notify;
    }

    public void Orders(){
        System.out.println("Orders is placed successfully");
        notify.Notify(); // calls the relevant method based on recieved instance

    }
}
