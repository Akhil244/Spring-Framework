package org.example.notifications;

public class Smsnotify implements NotificationService{

    @Override
    public void Notify() {
        System.out.println("SMS Notification sent");
    }
}
