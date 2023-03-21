package com.axis.customeException;

public class InputMisMatchException extends RuntimeException {

    public InputMisMatchException(String message) {
        super(message);
    }

}
