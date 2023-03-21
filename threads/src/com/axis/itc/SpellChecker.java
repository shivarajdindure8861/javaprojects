package com.axis.itc;

public class SpellChecker implements Runnable {
    public final ImpData dt;

    public SpellChecker(ImpData dt) {
        this.dt = dt;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            dt.increment();
        }
    }
}
