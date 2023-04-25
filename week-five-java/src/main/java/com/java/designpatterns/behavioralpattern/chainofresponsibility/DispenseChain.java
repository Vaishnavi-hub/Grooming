package com.java.designpatterns.behavioralpattern.chainofresponsibility;

public interface DispenseChain {
    public void dispense(Rupees rupees);
    public void setNextChain(DispenseChain nexChain);
}
