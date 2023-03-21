package com.axis.bank;

import com.axis.customer.Customer;

public class Bank {
    private final String bankName = "Axis Bank";
    private int branchId;
    private String branchName;

    public Bank(int branchId, String branchName) {
        this.branchId = branchId;
        this.branchName = branchName;
    }

    public String getBankName() {
        return bankName;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public static void main(String[] args) {
        Customer customer = new Customer();

    }

}
