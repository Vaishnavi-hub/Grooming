package com.java.designpatterns.behavioralpattern.chainofresponsibility;

public class Dispense20Rupees implements DispenseChain{
    private DispenseChain dispenseChain;

    @Override
    public void dispense(Rupees rupees) {
        int amount = rupees.getAmount();
        if(amount >= 20){
            int count = amount / 20;
            int remainder = amount % 20;
            System.out.println("Dispensing " + count + " Rs.20 note");
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
