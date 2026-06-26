package org.example;

import org.example.notifications.NotificationService;
import org.example.notifications.Smsnotify;


public class Main {
    static void main() {

        // now we inject the dependency of the relevant notify obj from main to order constructor
        // all the relevant methods are invoked in this main method

        NotificationService n = new Smsnotify();

        Orderservice o = new Orderservice(n);

        o.Orders();
    }
}
