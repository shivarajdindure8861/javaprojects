package com.axis.bankdata;

import java.util.InputMismatchException;
import java.util.Scanner;

import comaxis.customeException.InvalidInputException;

public class BankDataInput {
    private final Scanner scanner;

    public BankDataInput() {
        scanner = new Scanner(System.in);
    }

    private int readnumber() {
        int num = 0;
        try {
            num = scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            throw new InvalidInputException("please enter numbers only");
        }
        return num;

    }

    public int askForUserChoice() {
        System.out.println("Enter user choice");
        return readnumber();
    }

    public int askForId() {
        int id = readnumber();
        if (id <= 0)
            throw new InvalidInputException("please provide positive numbers");
        return id;
    }

    public String askForName() {
        String name = scanner.next();
        if (name.length() < 3)
            System.out.println("name must contains atleast three characters");
        return name;
    }

}
