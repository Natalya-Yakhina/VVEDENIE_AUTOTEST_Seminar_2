package org.example;

import java.util.ArrayList;
import java.util.List;

public class NewMessage extends NewsMakerAbstract { // создание сообщения
    public void setMessage(String message) {
        this.message = message + " - NewMessage";
    }
}
