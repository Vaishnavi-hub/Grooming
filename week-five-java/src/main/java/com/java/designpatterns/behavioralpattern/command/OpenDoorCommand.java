package com.java.designpatterns.behavioralpattern.command;

// Concrete Command Class
public class OpenDoorCommand implements Command{
    private Door door;

    public OpenDoorCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        this.door.openDoor();
    }
}
