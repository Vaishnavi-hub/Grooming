package com.java.designpatterns.behavioralpattern.command;

// receiver (smart home device)
public class Light{

    public void turnOnLight(){
        System.out.println("Turning on Lights...");
    }

    public void turnOffLight(){
        System.out.println("Turning off Lights...");
    }
}
