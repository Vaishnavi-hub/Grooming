package com.java.designpatterns.creationalpattern.abstractfactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        VehicleFactory vehicle1 = FactoryCreator.getFactory("Bike", "Yamaha");

        VehicleFactory vehicle2 = FactoryCreator.getFactory("Car", "BMW");
    }
}
