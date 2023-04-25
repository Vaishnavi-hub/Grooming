package com.java.designpatterns.behavioralpattern.chainofresponsibility;

public class Dispense200Rupees implements DispenseChain {
    private DispenseChain dispenseChain;

    @Override
    public void dispense(Rupees rupees) {
        int amount = rupees.getAmount();
        if(amount >= 200){
            int count = amount / 200;
            int remainder = amount % 200;
            System.out.println("Dispensing " + count + " Rs.200 note");
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
