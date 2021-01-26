
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author danie
 */
public class ShoppingCart {

    private Map<String, Item> list;

    public ShoppingCart() {
        this.list = new HashMap<>();

    }

    public void add(String product, int price) {
        if (!this.list.containsKey(product)) {
            Item item = new Item(product, 1, price);
            this.list.put(product, item);
        } else if (this.list.containsKey(product)) {
            Item item = this.list.get(product);
            item.increaseQuantity();
        }

    }

    public int price() {
        int sum = 0;
        for (Item value : this.list.values()) {
            sum += value.price();

        }
        return sum;
    }

    public void print() {
        for (String key : this.list.keySet()) {
            System.out.println(this.list.get(key));
        }
    }
}
