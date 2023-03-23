package com.java.enumdatatype;

public class Bike {
    public static void main(String[] args) {
        BikeEnum[] bikes = BikeEnum.values();
        // print name of each enum and it model and price value using getter method
        for(BikeEnum bike : bikes){
            System.out.println("Bike :" + bike.name() + " Model : " + bike.getModel() + " Price: " + bike.getPrice());
        }
    }
}
