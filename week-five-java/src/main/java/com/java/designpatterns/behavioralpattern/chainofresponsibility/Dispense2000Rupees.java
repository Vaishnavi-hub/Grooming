package com.java.designpatterns.behavioralpattern.chainofresponsibility;

public class Dispense2000Rupees implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void dispense(Rupees rupees) {
        int amount = rupees.getAmount();
        if(amount >= 2000){
            int count = amount / 2000;
            int remainder = amount % 2000;
            System.out.println("Dispensing " + count + " Rs.2000 note");
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
