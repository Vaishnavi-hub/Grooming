package com.java.designpatterns.behavioralpattern.templatemethod;

public class GlassHouse extends HouseTemplate{

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Glass coating");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildWindows(){
        System.out.println("Building Glass frame windows");
    }
}
