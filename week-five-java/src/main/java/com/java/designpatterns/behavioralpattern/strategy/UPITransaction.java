package com.java.designpatterns.behavioralpattern.strategy;

public class UPITransaction implements PaymentStrategy{
    private String upiId;
    private String upiPin;

    public UPITransaction(String upiId, String upiPin) {
        this.upiId = upiId;
        this.upiPin = upiPin;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Rs." + amount + " paid through UPI Transaction");
    }
}
