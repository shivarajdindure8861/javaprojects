package com.axis.itemController;

import java.util.ArrayList;
import java.util.List;

import com.axis.customeException.ItemNotFoundException;

public class ItemDb {
    private static final ArrayList<Item> items = new ArrayList<>();

    public static void addItem(int id, String name, double price) {
        Item item = new Item(id, name, price);
        items.add(item);
    }

    public static List<Item> listItems() {
        return items;
    }

    public static Item findItemById(int itemId) {
        for (Item item : items) {
            if (item.getId() == itemId) {
                return item;
            }

        }
        throw new ItemNotFoundException("Item Id : " + itemId + " is not Found");
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Item item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }
}
