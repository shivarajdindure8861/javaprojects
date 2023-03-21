package com.axis.user;

import com.axis.cart.CartDataInput;

public class UserMenu {
    private CartDataInput ip;
    private final UserController controller;

    public UserMenu() {
        ip = new CartDataInput();
        controller = new UserController();
    }

    private void displayMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append("🔥 User Menu 🔥")
                .append("\n")
                .append("-------------------")
                .append("Select your choice \n")
                .append("----------------")
                .append("1.addNewUser")
                .append("\n")
                .append("2.ListOfUser")
                .append("\n")
                .append("3.SelectUser")
                .append("\n")
                .append("4.exit")
                .append("\n");
        System.out.println(builder.toString());

    }

    public void performAction() {

        while (true) {

            displayMenu();
            int choice = ip.askForChoice();
            if (choice >= 4) {
                System.out.println("thanks for using our services");
                break;
            } else if (choice == 1) {
                System.out.println("you are selected new user\n");
                try {
                    int id = ip.askForId();

                    String name = ip.askForName();
                    controller.createNewUser(id, name);
                } catch (Exception e) {
                    e.getMessage();
                }
            } else if (choice == 2) {

                System.out.println("you are selected list of AllUsers");
                controller.listofAllUsers();
            } else if (choice == 3) {
                int id = ip.askForId();
                System.out.println("you are selected select user ");
                controller.selectUserById();
            }

        }
    }
}
