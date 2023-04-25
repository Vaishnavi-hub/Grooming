package com.java.designpatterns.behavioralpattern.command;

// receiver (smart home device)
public class Door{
    
    public void openDoor(){
        System.out.println("Opening the door...");
    }

    public void closeDoor(){
        System.out.println("Closing the door...");
    }
}
