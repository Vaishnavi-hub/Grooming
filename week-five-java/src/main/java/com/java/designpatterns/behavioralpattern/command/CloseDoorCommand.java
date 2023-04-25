package com.java.designpatterns.behavioralpattern.command;

// Concrete Command Class
public class CloseDoorCommand implements Command{
    private Door door;

    public CloseDoorCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        this.door.closeDoor();
    }
}
