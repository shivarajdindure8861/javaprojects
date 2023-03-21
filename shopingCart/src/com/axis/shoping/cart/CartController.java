package com.axis.shoping.cart;

import java.util.List;

import com.axis.itemController.Item;
import com.axis.itemController.ItemDb;

public class CartController {
    private int userId;

    public void setId(int userId) {
        this.userId = userId;
    }

    public void addItemToCart(int itemId) {
        // first find item in items db by its id
        CartDb.addItemToCart(userId, itemId);
    }

    public List<Item> cartItems(int cartId) {
        return CartDb.findItemsByCartId(cartId);
    }

}
