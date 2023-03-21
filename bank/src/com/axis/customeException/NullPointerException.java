package com.axis.customeException;

public class NullPointerException extends RuntimeException {
    private String message;

    public NullPointerException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
