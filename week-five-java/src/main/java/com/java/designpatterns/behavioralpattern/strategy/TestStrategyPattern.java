package com.java.designpatterns.behavioralpattern.strategy;

public class TestStrategyPattern {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("Pen", 156, 55);
        Item item2 = new Item("Water Bottle", 642, 80);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        // customer paying through Card
        shoppingCart.pay(new CardStrategy("Akshaya S", "1234567890987654", "987", "07/24"));
        
        // customer paying through UPI Transaction
        shoppingCart.pay(new UPITransaction("akshaya@ybl", "1234"));
        
        // customer paying through COD
        shoppingCart.pay(new CashOnDelivery());
    }
}
