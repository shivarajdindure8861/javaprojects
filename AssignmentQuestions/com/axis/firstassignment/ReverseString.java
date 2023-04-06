package com.axis.firstassignment;

import java.util.Scanner;

public class ReverseString {
    private Scanner scanner;

    public void ReverseString() {
        scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String revstr = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revstr += s.charAt(i);
        }
        System.out.println("" + revstr);
    }
}
