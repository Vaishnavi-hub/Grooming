package com.java.designpatterns.behavioralpattern.chainofresponsibility;

public class Dispense10Rupees implements DispenseChain{
    private DispenseChain dispenseChain;

    @Override
    public void dispense(Rupees rupees) {
        int amount = rupees.getAmount();
        if(amount >= 10){
            int count = amount / 10;
            int remainder = amount % 10;
            System.out.println("Dispensing " + count + " Rs.10 note");
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
