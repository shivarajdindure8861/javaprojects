package com.axis.cart;

import com.axis.item.Item;
import com.axis.user.User;

public class Cart {
    private User[] users;
    private Item[] items;
    private double totalPrice;

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

}
