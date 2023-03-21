package com.axis.innerclass;

public class Outer {
    private int data = 10;

    class NormalInner {
        private int dataInner = 90;

        public void accessOuter() {
            data = 99;
            System.out.println(data);
        }
    }

    public static class StaticInner {
        public void staticOuter() {
            // data = 10;
        }
    }

    public void display() {
        int i = 11;
        class Formatter {

        }
        Formatter ft = new Formatter();

    }
}
