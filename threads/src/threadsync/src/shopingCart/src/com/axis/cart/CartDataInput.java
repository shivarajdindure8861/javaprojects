package com.axis.cart;

import java.util.Scanner;

import com.axis.exceptions.InvalidInputException;

public class CartDataInput {
    private final Scanner scanner;

    public CartDataInput() {
        scanner = new Scanner(System.in);
    }

    private int readNumber() {
        int num = 0;
        try {
            num = scanner.nextInt();
        } catch (Exception e) {
            throw new InvalidInputException("enter Numbers only");
        }
        return 0;
    }

    public int askForChoice() {
        System.out.println("Enter your choice :");
        return readNumber();
    }

    public int askForId() {
        System.out.println("Enter Id");
        int id = readNumber();
        if (id < 0) {
            throw new InvalidInputException("id is wrong please provide positive numbers only");
        }
        return id;
    }

    public String askForName() {
        System.out.println("Enter Name : ");
        String name = scanner.next();
        if (name.length() < 3) {
            throw new InvalidInputException("Name must be greter then three characters");
        }
        return name;
    }

}
