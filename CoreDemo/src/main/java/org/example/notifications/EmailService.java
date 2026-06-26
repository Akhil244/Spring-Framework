package org.example.notifications;

public class EmailService implements NotificationService {

    @Override
    public void Notify() {
        System.out.println("Email Notify Service is Sent");
    }
}
