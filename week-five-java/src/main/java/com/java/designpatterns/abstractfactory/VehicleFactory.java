package com.java.designpatterns.abstractfactory;

public interface VehicleFactory {
    public Car createCar(String carName);
    public Bike createBike(String bikeName);
}
