package com.java.designpatterns.creationalpattern.abstractfactory;

public class CarFactory implements VehicleFactory {

    @Override
    public Car createCar(String carName) {
        if(carName == null){
            return null;
        }
        else if(carName.equalsIgnoreCase("BMW")){
            return new BMWCar();
        }
        else if(carName.equalsIgnoreCase("Honda")){
            return new HondaCar();
        }
        return null;
    }

    @Override
    public Bike createBike(String bikeName) {
        return null;
    }
    
}
