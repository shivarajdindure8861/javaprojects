package com.axis.anotation;

import java.util.ArrayList;
import java.util.List;

public class Tiger extends Animal {
    @Checker
    private int speed;
    @Checker
    private String color;

    @Override
    public void walk() {

    }

    @SuppressWarnings("donot show warnings")
    public void run() {
        List lst = new ArrayList<>();
        lst.add("abc");
    }

    @Deprecated
    public void runFast() {

    }

}
