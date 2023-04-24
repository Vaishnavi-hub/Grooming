package com.java.designpatterns.behavioralpattern.strategy;

public class CardStrategy implements PaymentStrategy {

    private String cardHolderName;
    private String cardNumber;
    private String dateOfExpiry;
    private String cvv;

    public CardStrategy(String cardHolderName, String cardNumber, String dateOfExpiry, String cvv) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.dateOfExpiry = dateOfExpiry;
        this.cvv = cvv;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Rs." + amount + " paid through Credit/Debit card");
    }
    
}
