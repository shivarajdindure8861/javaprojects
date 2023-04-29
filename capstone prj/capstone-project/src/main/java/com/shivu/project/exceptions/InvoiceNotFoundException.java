package com.shivu.project.exceptions;

public class InvoiceNotFoundException extends RuntimeException {
    public InvoiceNotFoundException(String msg) {
        super(msg);
    }
}
