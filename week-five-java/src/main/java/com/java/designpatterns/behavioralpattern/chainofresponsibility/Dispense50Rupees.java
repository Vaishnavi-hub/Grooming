package com.java.designpatterns.behavioralpattern.chainofresponsibility;

public class Dispense50Rupees implements DispenseChain{
    private DispenseChain dispenseChain;

    @Override
    public void dispense(Rupees rupees) {
        int amount = rupees.getAmount();
        if(amount >= 50){
            int count = amount / 50;
            int remainder = amount % 50;
            System.out.println("Dispensing " + count + " Rs.50 note");
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
