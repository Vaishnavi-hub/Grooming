package com.java.designpatterns.behavioralpattern.templatemethod;

public class HousingClient {
    public static void main(String[] args) {

        HouseTemplate brickHouse = new BrickHouse();
        brickHouse.buildHouse();
        System.out.println("--------------------------------------------------");

        HouseTemplate woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();
        System.out.println("--------------------------------------------------");

        HouseTemplate glassHouse = new GlassHouse();
        glassHouse.buildHouse();
        System.out.println("--------------------------------------------------");
    }
}
