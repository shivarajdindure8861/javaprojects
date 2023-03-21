package com.axis.swap;

class Swap {
    private int a;
    private int b;

    public Swap(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

}

class Swaping {
    public Swap doSwap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        return new Swap(a, b);
    }
}

public class SwapMain {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        Swaping swamp = new Swaping();
        System.out.println("Before swaping the value of a is " + a + " b is " + b);
        Swap sw = swamp.doSwap(a, b);
        // swaping.doSwap(a, b);
        System.out.println("After swaping the value of a is " + sw.getA() + " b is " + sw.getB());
    }

}
