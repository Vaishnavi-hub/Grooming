package com.java.designpatterns.behavioralpattern.command;

// Concrete Command Class
public class TurnOffLightCommand implements Command{
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOffLight();
    }
}
