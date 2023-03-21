package com.axis.bank.user;

import com.axis.bankdata.BankDataInput;

public class UserMenu {
    BankDataInput ip;
    UserController controller;

    public UserMenu() {
        ip = new BankDataInput();
        controller = new UserController();
    }

    private void displayMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append("🔥 User Menu 🔥")
                .append("\n")
                .append("-------------------")
                .append("\n")
                .append("Select Your Choice")
                .append("\n")
                .append("-------------------")
                .append("\n")
                .append("1. Create new Account")
                .append("\n")
                .append("2.Get Bank Balance : ")
                .append("\n")
                .append("3. Withdraw")
                .append("\n")
                .append("4. Money Transfer")
                .append("\n")
                .append("5.get transaction Details")
                .append("6.Exit");

        System.out.println(builder.toString());
    }

    public void performAction() {

        while (true) {
            displayMenu();

            int ch = 0;
            try {
                ch = ip.askForUserChoice();
            } catch (Exception e) {
                System.out.println("\n ❌ Enter Numbers Only \n");
            }

            if (ch > 6) {
                System.out.println("\n 🙏 Thanks for using our services");
                break;
            } else {
                if (ch == 1) {
                    System.out.println("\n 👏 You selected Open new Account \n");
                    try {
                        int id = ip.askForId();
                        String name = ip.askForName();
                        controller.openAccount(id, name);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println("Account created successfully");
                }
                if (ch == 2) {
                    System.out.println(" \n 👏 You selected Show Balance \n ");
                    UserDb.availableBalance();
                }
                if (ch == 3) {
                    System.out.println(" \n 👏 You are selected to withdraw \n ");
                    UserController.withdraw(ch);

                }
                if (ch == 4) {
                    System.out.println("you are selected Money transfer");
                    UserController.transfer(ch);
                }
                if (ch == 5) {
                    System.out.println("you are Selected transaction details");
                    UserDb.getTransactionDet();
                }
            }
        }
    }
}
