package com.axis.bank.user;

import com.axis.bankdata.BankDb;

public class UserController {
    public void openAccount(int id, String name) {
        int sts = BankDb.addNewUser(id, name, name);
        if (sts == BankDb.USER_ALREADY_EXISTS)
            System.out.println("Account with id " + id + " is already exist");
        else
            System.out.println("Account created successfully ");

    }

    public static int withdraw(int amount) {

        return 0;
    }

    static int transfer(int amountToTransfer) {
        return 0;
    }

    public static double checkBalance() {
        return 0.0;
    }

}
