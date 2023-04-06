package com.axis.mockassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SquaringNumByLambda {

    private Scanner scanner;

    public void squareofNum() {
        scanner = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
            System.out.println("enter " + i + " Element");
            int n = scanner.nextInt();
            num.add(n);
            if (num.size() > 10) {
                System.out.println("Error");
            }
        }
        for (int el : num) {
            System.out.println(el);
        }
    }
}
