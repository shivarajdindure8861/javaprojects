package com.axis.bank.controller;

import java.util.Scanner;

class Menu {

    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    private void displayMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append("Bank Menu")
                .append("\n")
                .append("Select your choice ")
                .append("\n")
                .append("1.DisplayBalance")
                .append("\n")
                .append("2.Withdraw")
                .append("\n")
                .append("3.transfer Amount")
                .append("\n")
                .append("4.Deposite Amount");
        System.out.println(builder.toString());
    }

    public void performAction() {
        while (true) {
            displayMenu();
            int choice;
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("You are selected DisplayBalance");
                UserController.displayBalance();

            } else if (choice == 2) {
                System.out.println("You are selected withdraw");
                UserController.withdraw();
            } else if (choice == 3) {
                System.out.println("you are selected transfer amount");
                UserController.transfer();

            } else if (choice == 4) {
                System.out.println("Deposite money");
                UserController.deposite();
            } else if (choice == 5) {
                System.out.println("Thank you Visit Again");
                break;
            } else {
                System.out.println("Invalid choice");
            }
            System.out.println("--------------------");
        }
    }
}

public class BankMenu {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.performAction();
    }
}
