package com.shiva.solidprinciple;

public class Ocp {
}

// this is not closed for modification
class Product {
    public void applyDiscount(double amt, String item) {
        throw new UnsupportedOperationException();
    }

}

// good example - using an example of interface to make class is open for
// extension
interface Discountable {
    public void applyDiscount(double amt, String item);
}

class DiscountedProduct implements Discountable {

    @Override
    public void applyDiscount(double amt, String item) {

        throw new UnsupportedOperationException("Unimplemented method 'applyDiscount'");
    }

}
