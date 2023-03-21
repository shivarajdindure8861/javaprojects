package com.axis.user;

import com.axis.customeException.UserNotFoundException;

public class UserDb {
    public static final int NO_MORE_SPACE = 100;
    public static final int USER_ALREADY_EXIST = 100;
    public static final int USER_SUCCESSFULLY_CREATED = 101;

    private static final User[] users = new User[5];

    public static int addNewUser(int id, String name) {
        int emptyPos = getEmptyPosition();
        if (emptyPos == -1) {
            return NO_MORE_SPACE;
        }
        int pos = isExist(id);
        if (pos != -1) {
            return USER_ALREADY_EXIST;
        }
        User user = new User(id, name);
        users[emptyPos] = user;

        return USER_SUCCESSFULLY_CREATED;

    }

    private static int isExist(int id) {
        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            if (user != null) {
                if (user.getUserId() == id) {
                    return i;
                }
            }

        }
        return -1;
    }

    public static User[] listAllUsers() {
        if (users == null)
            throw new UserNotFoundException("user is not present");

        return users;
    }

    private static int getEmptyPosition() {
        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            if (user == null) {
                return i;
            }

        }

        return -1;
    }

    public static User findUserById(int userId) {
        for (User user : users) {
            if (user.getUserId() == userId) {
                return user;
            }

        }
        throw new UserNotFoundException("user with id " + userId + " not found");

    }

}
