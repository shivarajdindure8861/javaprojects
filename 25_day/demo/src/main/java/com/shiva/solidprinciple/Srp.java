package com.shiva.solidprinciple;

public class Srp {
}

// Bad example
class Customer {
    public void createNewAccount() {
        throw new UnsupportedOperationException();
    }

    public void sendEmail() {
        throw new UnsupportedOperationException();
    }
}

// good example
class CustomerAccount {
    public void sendEmail() {
        throw new UnsupportedOperationException();
    }
}
