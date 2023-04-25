package com.java.designpatterns.behavioralpattern.command;

// Client
public class Person {
    public static void main(String[] args) {
        // create invoker instance
        RemoteControl remoteControl = new RemoteControl();

        // create receiver instance
        Light light = new Light();
        // create command instance
        Command turnOnLightCommand = new TurnOnLightCommand(light);
        Command turnOffLightCommand = new TurnOffLightCommand(light);
        
        // turn on light
        remoteControl.setCommand(turnOnLightCommand);
        remoteControl.pressButton();

        // turn off light
        remoteControl.setCommand(turnOffLightCommand);
        remoteControl.pressButton();

        // create receiver instance
        Door door = new Door();
        // create command instance
        Command openDoorCommand = new OpenDoorCommand(door);
        Command closeDoorCommand = new CloseDoorCommand(door);

        // open the door
        remoteControl.setCommand(openDoorCommand);
        remoteControl.pressButton();

        // close the door
        remoteControl.setCommand(closeDoorCommand);
        remoteControl.pressButton();
    }
}
