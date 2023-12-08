package org.example;

public class Main {
    public static void main(String[] args) {
        NewsMakerAbstract newspaper = new NewMessage();
        NewsMakerAbstract magazine = new Magazine();
        Subscriber subscriber1 = new SubscriberImplement();
        Subscriber subscriber2 = new SubscriberImplement();
        newspaper.subscribeRegistration(subscriber1);
        magazine.subscribeRegistration(subscriber1);
        magazine.subscribeRegistration(subscriber2);

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                publishNews(newspaper, i);
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
