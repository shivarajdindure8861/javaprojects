package com.axis.user;

import com.axis.itemController.Item;
import com.axis.itemController.ItemDb;

public class UserController {
    public void createUser(int id, String name) {
        int sts = UserDb.addNewUser(id, name);
        if (sts == UserDb.NO_MORE_SPACE) {
            System.out.println("there is no more space ");
        } else if (sts == UserDb.USER_ALREADY_EXIST) {
            System.out.println("User is already exist");
        } else {

            System.out.println("User successfully created ");
        }
        System.out.println("\n");
    }

    public User listAllUser() {
        User[] users = UserDb.listAllUsers();
        for (User user : users) {
            if (user != null)
                System.out.println("Id : " + user.getUserId() + " Name : " + user.getName());
        }
        System.out.println("\n");
        return null;

    }

    public double totalCartPrice(int userId) {
        return totalCartPrice(userId);

    }
}
