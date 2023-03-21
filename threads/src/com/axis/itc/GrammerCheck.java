package com.axis.itc;

public class GrammerCheck implements Runnable {
    private final ImpData dt;

    public GrammerCheck(ImpData dt) {
        this.dt = dt;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            dt.decrement();
        }
    }

}
