package org.example;

public class Magazine extends NewsMakerAbstract {
    public void setMessage(String message) {
        this.message = message + " " + this.getClass().getName();;
    }
}
