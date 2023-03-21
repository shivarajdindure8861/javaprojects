package com.axis.bankdata;

import java.util.ArrayList;
import java.util.List;

import com.axis.bank.user.User;

public class BankDb {
    public static final int USER_ALREADY_EXISTS = 990;
    public static final int USER_SUCCESSFULLY_CREATED = 1001;
    private static final List<User> users = new ArrayList<User>();

    public static ArrayList<User> listOfUser() {
        return null;
    }

    public static int addNewUser(int id, String name, String dob) {
        return 0;
    }

    public static int isExist(int id) {
        for (User user : users) {
            int userId = user.getuId();
            if (userId == id)
                return USER_ALREADY_EXISTS;

        }
        return -1;
    }

}
