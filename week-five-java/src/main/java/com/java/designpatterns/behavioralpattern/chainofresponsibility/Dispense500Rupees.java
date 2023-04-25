package com.java.designpatterns.behavioralpattern.chainofresponsibility;

public class Dispense500Rupees implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void dispense(Rupees rupees) {
        int amount = rupees.getAmount();
        if(amount >= 500 && amount < 2000){
            int count = amount / 500;
            int remainder = amount % 500;
            System.out.println("Dispensing " + count + " Rs.500 note");
            if(remainder != 0){
                this.dispenseChain.dispense(new Rupees(remainder));
            }
        }
        else{
            this.dispenseChain.dispense(rupees);
        }
    }

    @Override
    public void setNextChain(DispenseChain dispenseChain) {
        this.dispenseChain = dispenseChain;
    }
}
