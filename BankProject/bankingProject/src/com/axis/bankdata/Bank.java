package com.axis.bankdata;

import java.util.List;

import com.axis.bank.user.User;

public class Bank {
    private final int branchId = 123;
    private final String bankName = "Axis Bank";
    private List<User> users;

    public int getBranchId() {
        return branchId;
    }

    public String getBankName() {
        return bankName;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}
