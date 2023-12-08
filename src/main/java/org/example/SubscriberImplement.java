package org.example;

public class SubscriberImplement implements Subscriber {
    @Override
    public void getMessage(String message) {
        System.out.println(message);
    }
}
