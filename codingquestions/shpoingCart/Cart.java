package com.axis.shpoingCart;

public class Cart {
    private User user;
    private Item[] items;
    private double totalPrice;

    public User getUse() {
        return user;
    }

    public void setUser(User use) {
        this.user = use;
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
