package org.example;

public interface NewsMaker { // продюссер
    void sendMessage(); // метод отправки сообщения / оповещения / публикации сообщения (без значения - абстрактный)

    void subscribeRegistration(Subscriber subscriber); // метод регистрации подписчика

}
