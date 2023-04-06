package com.axis.firstassignment;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringPallindrome {
    private Scanner scanner;
    String ip;

    public String checkForPallindrome() {
        String rev = "";
        scanner = new Scanner(System.in);
        String ip = "";
        try {
            ip = scanner.next().toLowerCase();
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        for (int i = ip.length() - 1; i >= 0; i--) {
            rev += ip.charAt(i);

        }
        if (rev.equals(ip)) {
            return "YES";
        } else {
            return "No";
        }

    }
}
