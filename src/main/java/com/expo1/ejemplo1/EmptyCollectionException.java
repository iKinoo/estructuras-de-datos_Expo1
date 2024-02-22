package com.expo1.ejemplo1;

public class EmptyCollectionException extends Exception {

    public EmptyCollectionException(String message) {
        super(message + " is empty.");
    }
}
