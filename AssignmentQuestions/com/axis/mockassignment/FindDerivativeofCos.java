package com.axis.mockassignment;

import java.util.Scanner;

public class FindDerivativeofCos {
    private Scanner scanner;

    public void findderivatives() {
        scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double cosx = -Math.sin(x);
        System.out.println(cosx);
    }

}
