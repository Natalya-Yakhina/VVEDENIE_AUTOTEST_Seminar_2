package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class NewsMakerAbstract implements NewsMaker {
    protected String message; // новость (protected - чтобы видели наследники)
    private final List<Subscriber> subscribers = new ArrayList<>(); // подписчики

    @Override
    public void sendMessage() { // рассылка сообщения подписчикам
        for (Subscriber sub : subscribers) {
            sub.getMessage(message);
        }
    }

    @Override
    public void subscribeRegistration(Subscriber subscriber) { // добавляем подписчика
        subscribers.add(subscriber);
    }

    public abstract void setMessage(String message);
}
