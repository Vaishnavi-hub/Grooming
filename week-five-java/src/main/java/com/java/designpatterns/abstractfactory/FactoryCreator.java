package com.java.designpatterns.abstractfactory;

public class FactoryCreator {
    public static VehicleFactory getFactory(String vehicleType, String vehicleName){
        if(vehicleType == null){
            return null;
        }
        else if(vehicleType.equalsIgnoreCase("Bike")){
            VehicleFactory bikeVehicle =  new BikeFactory();
            Bike bike = bikeVehicle.createBike(vehicleName);
            bike.ride();
        }
        else if(vehicleType.equalsIgnoreCase("Car")){
            VehicleFactory carVehicle = new CarFactory();
            Car car = carVehicle.createCar(vehicleName);
            car.drive();
        }
        return null;
    }
}
