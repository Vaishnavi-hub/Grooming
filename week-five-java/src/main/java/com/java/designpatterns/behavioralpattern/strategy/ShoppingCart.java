package com.java.designpatterns.behavioralpattern.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    
    List<Item> items;
    
    public ShoppingCart(){
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotalPrice(){
        int sum = 0;
        for (Item item : items) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy){
        int amount = calculateTotalPrice();
        paymentStrategy.pay(amount);
    }
}
