package org.example.notifications;

public class Fakeservice implements NotificationService {

    @Override
    public void Notify() {
        System.out.println("Fake Notify is sent");
    }
}
