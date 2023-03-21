package com.axis.user;

public class Userdb {
    static final int NO_MORE_SPACE = 10;
    static final int USER_ALREADY_EXIST = 20;
    private static final int USER_SUCCESSFULLY_CREATED = 100;

    private static final User[] users = new User[5];

    public static int addNewUser(int id, String name) {
        int emptypos = getEmptyPosition();
        if (emptypos == -1) {
            return NO_MORE_SPACE;
        }
        // check user aailability
        int pos = isExist(id);
        if (pos != -1) {
            return USER_ALREADY_EXIST;
        }
        // if user is fresh
        // and emptyPosition is present
        User user = new User(id, name);
        users[emptypos] = user;
        return USER_SUCCESSFULLY_CREATED;
    }

    public static User[] listofUsers() {

        for (User user : users) {
            if (users != null) {
                System.out.println("Name : " + user.getName() + " Id is : " + user.getId());
            }
        }
        return null;
    }

    private static int isExist(int id) {
        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            if (user != null) {
                if (user.getId() == id) {
                    return i;// returns already existing id
                }
            }

        }
        return -1;// if suplied id is fresh
    }

    private static int getEmptyPosition() {
        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            if (user == null) {
                return i;// at ith location the space is empty
            }
        }
        return -1;// no empty space exist
    }
}
