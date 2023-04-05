package com.shivu.aop.xl;

import org.springframework.stereotype.Component;

@Component
public class XLReader {
    public void readXLData() {
        System.out.println("Reading xl data");
    }

    public double readAmountCell() {
        return 0.9;
    }
}
