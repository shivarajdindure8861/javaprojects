package com.axis.user;

import java.util.Scanner;

import com.axis.item.Item;

public class UserController {
    Scanner ip;

    public void createNewUser(int id, String name) {
        int sts = Userdb.addNewUser(id, name);
        if (sts == Userdb.NO_MORE_SPACE) {
            System.out.println("there is no more space");
        } else if (sts == Userdb.USER_ALREADY_EXIST) {
            System.out.println("User is already exist");
        } else {
            System.out.println("user is created successfully");
        }
        System.out.println("--------------------------");

    }

    public void listofAllUsers() {
        User[] users = Userdb.listofUsers();
        for (User user : users) {
            if (user != null) {
                System.out.println("user id : " + user.getId() + " Name is : " + user.getName());
            } else {
                throw new NullPointerException("User is not found");
            }
        }
        System.out.println("------------------------");
    }

    public double totalCartPrice() {
        if (totalCartPrice() > 0) {
            return totalCartPrice();
        } else {
            System.out.println("no cartprice found");
        }
        return 0;
    }

    public void selectUserById() {

        System.out.println("Enter id : ");
        int id = ip.nextInt();

        User[] users = Userdb.listofUsers();
        for (User user : users) {
            if (id == user.getId()) {
                System.out.println("Name is : " + user.getName());
            }
        }
    }
}
