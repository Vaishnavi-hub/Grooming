package com.java.designpatterns.creationalpattern.abstractfactory;

public interface VehicleFactory {
    public Car createCar(String carName);
    public Bike createBike(String bikeName);
}
