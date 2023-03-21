package com.axis.bank;

import com.axis.customer.Customer;

public class CustomerDb {
    Customer customer;

    public String addCustomer() {
        return null;
    }

    public boolean deleteCustomer() {
        return false;
    }

    public void updateCustomer() {

        System.out.println("Customer data updated Successfully");
    }

    public void getCustomerDetails() {
        System.out.println("Name : " + customer.getName());
        System.out.println("Account Number : " + customer.getId());
        System.out.println("Mobile num : " + customer.getPhno());
    }
}
