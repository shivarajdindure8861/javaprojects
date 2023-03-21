package com.axis.shpoingCart;

public class CartMain {
    public static void main(String[] args) {
        User user = new User();
        user.setId(10);
        user.setName("abc");

        Cart cart = new Cart();
        cart.setUser(user);

        Item[] item = new Item[10];
        item[0] = new Item("Parle", 1, 5);
        item[1] = new Item("a", 2, 10);
        item[2] = new Item("B", 3, 15);

        cart.setItems(item);

    }
}
