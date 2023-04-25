package com.java.designpatterns.behavioralpattern.command;

// Concrete Command Class
public class TurnOnLightCommand implements Command{
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.turnOnLight();
    }

}
