package com.java.designpatterns.behavioralpattern.state;

public class TVOnState implements TVRemoteState{
    
    @Override
    public void doAction() {
        System.out.println("TV turned ON");
    }
}
