package org.example;

public class TextException extends Exception {
    public TextException() {
    }
    public void textException(String i) {
        System.out.println("Exception: ");
        System.out.printf("", i);
        System.out.println();
    }
}
