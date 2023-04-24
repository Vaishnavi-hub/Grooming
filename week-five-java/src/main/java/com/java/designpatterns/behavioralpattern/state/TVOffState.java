package com.java.designpatterns.behavioralpattern.state;

public class TVOffState implements TVRemoteState{
    
    @Override
    public void doAction() {
        System.out.println("TV turned OFF");
    }
}
