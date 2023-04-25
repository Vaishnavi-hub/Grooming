package com.java.designpatterns.behavioralpattern.templatemethod;

public class BrickHouse extends HouseTemplate{

    @Override
    public void buildPillars() {
        System.out.println("Building Concrete Pillars");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building Brick Walls");
    }
    
}
