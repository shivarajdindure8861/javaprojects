package com.axis.shoping.cart;

import java.util.ArrayList;

import com.axis.itemController.Item;
import com.axis.user.User;

public class Cart {
    private int id;
    private User user;
    private ArrayList<Item> items = new ArrayList<>();
    private double totalCartPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public double getTotalCartPrice() {
        return totalCartPrice;
    }

    public void setTotalCartPrice(double totalCartPrice) {
        this.totalCartPrice = totalCartPrice;
    }

}
