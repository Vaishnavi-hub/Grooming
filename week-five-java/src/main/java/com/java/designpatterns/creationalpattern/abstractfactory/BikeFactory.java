package com.java.designpatterns.creationalpattern.abstractfactory;

public class BikeFactory implements VehicleFactory{
    @Override
    public Car createCar(String carName) {
        return null;
    }

    @Override
    public Bike createBike(String bikeName) {
        // Bike bike = null;
        if(bikeName == null){
            return null;
        }
        else if(bikeName.equalsIgnoreCase("Yamaha")){
            return new YamahaBike();
        }
        else if(bikeName.equalsIgnoreCase("Royal Enfield")){
            return new RoyalEnfieldBike();
        }
        return null;
    }
}
