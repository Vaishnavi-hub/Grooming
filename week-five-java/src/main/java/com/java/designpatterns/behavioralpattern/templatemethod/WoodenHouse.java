package com.java.designpatterns.behavioralpattern.templatemethod;

public class WoodenHouse extends HouseTemplate {

    @Override
    public void buildPillars() {
        System.out.println("Building Wooden Pillars");
    }

    @Override
    public void buildWalls() {
        System.out.println("Building Wooden Walls");
    }
}
