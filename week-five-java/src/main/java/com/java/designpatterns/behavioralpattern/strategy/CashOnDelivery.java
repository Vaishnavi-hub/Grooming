package com.java.designpatterns.behavioralpattern.strategy;

public class CashOnDelivery implements PaymentStrategy {

    @Override
    public void pay(int amount) {
        System.out.println("Rs." + amount + " paid through Cash On Delivery");
    }
    
}
