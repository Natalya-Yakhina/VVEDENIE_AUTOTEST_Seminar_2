package org.example;

public class Main {
    public static void main(String[] args) {
        NewsMakerAbstract newMessage = new NewMessage(); // сообщение
        NewsMakerAbstract magazine = new Magazine(); // магазин
        Subscriber subscriber1 = new SubscriberImplement(); // подписчик1
        Subscriber subscriber2 = new SubscriberImplement(); // подписчик2
        newMessage.subscribeRegistration(subscriber1); // регистрация подписчика1
        magazine.subscribeRegistration(subscriber1); //
        magazine.subscribeRegistration(subscriber2);

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                publishNews(newMessage, i);
            } else {
                publishNews(magazine, i);
            }
        }
    }

    private static void publishNews(NewsMakerAbstract abstractNewsMaker, int i) {
        abstractNewsMaker.setMessage("Новость: " + i);
        abstractNewsMaker.sendMessage();
    }
}
