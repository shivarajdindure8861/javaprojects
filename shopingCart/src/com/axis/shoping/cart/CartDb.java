package com.axis.shoping.cart;

import java.util.ArrayList;
import java.util.List;

import com.axis.customeException.CartNotFoundException;
import com.axis.itemController.Item;
import com.axis.itemController.ItemDb;
import com.axis.user.User;
import com.axis.user.UserDb;

public class CartDb {
    private static final ArrayList<Cart> carts = new ArrayList<>();

    public static void addCart(int cartId, int userId) {

        User user = UserDb.findUserById(userId);

        Cart cart = new Cart();
        cart.setId(cartId);
        cart.setUser(user);
        carts.add(cart);
    }

    public static void addItemToCart(int id, int userId) {

        User user = UserDb.findUserById(userId);
        Cart cart = new Cart();
        cart.setId(id);
        cart.setUser(user);
        carts.add(cart);

    }

    public static List<Cart> allCarts() {
        return carts;
    }

    public static List<Item> findItemsByCartId(int cartId) {
        return findCartById(cartId).getItems();
    }

    public static Cart findCartById(int cartId) {
        for (Cart cart : carts) {
            if (cart.getId() == cartId) {
                return cart;
            }
        }
        throw new CartNotFoundException("❌ Cart Id " + cartId + " Not Found");
    }
}
