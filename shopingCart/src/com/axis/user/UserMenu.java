package com.axis.user;

import com.axis.input.CartDataInput;
import com.axis.itemController.ItemController;
import com.axis.shoping.cart.CartController;

import com.axis.shoping.cart.CartMenu;

public class UserMenu {
    private final CartDataInput ip;
    private final UserController controller;

    private CartMenu cartMenu;
    private CartController cartController;

    public UserMenu(CartDataInput ip,
            UserController controller,
            CartController cartController,
            CartMenu cartMenu,
            ItemController itemController) {
        this.ip = ip;
        this.controller = controller;
        this.cartController = cartController;
        this.cartMenu = cartMenu;
    }

    private void displayMenu() {
        StringBuilder builder = new StringBuilder();
        builder.append("User menu ")
                .append("\n")
                .append("--------------")
                .append("\n")
                .append("Select user choice")
                .append("\n")
                .append("1.new user")
                .append("\n")
                .append("2.list All User")
                .append("\n")
                .append("3.Go to userCart")
                .append("\n")
                .append("4.Exit")
                .append("\n");
        System.out.println(builder.toString());

    }

    public void performAction() {
        displayMenu();
        while (true) {
            int ch = 0;
            try {
                ch = ip.askForChoice();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            if (ch == 2) {
                System.out.println("you are selected user ");
                controller.listAllUser();

            } else {
                if (ch == 1) {
                    System.out.println("\n 👏 You selected New User \n");
                    try {
                        int id = ip.askForId("Enter User Id");
                        String name = ip.askForName("Enter User Name");
                        controller.createUser(id, name);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                if (ch >= 4) {
                    System.out.println("Thanks for usinng our services ");
                    break;
                }
                if (ch == 3) {
                    System.out.println(" \n 👏 Entering to User Cart \n ");

                    int userId = ip.askForId("Enter User Id");
                    cartController.setId(userId);
                    cartMenu.performAction();
                }
            }
        }

    }
}
