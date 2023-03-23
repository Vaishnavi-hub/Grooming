package com.java.enumdatatype;

//program to demonstrate an Enum which has private constructor which accepts two args
public enum BikeEnum {
    TVS("TVS Raider 125", 91356),
    HONDA("BMW G310 RR", 294982),
    YAMAHA("Yamaha MT 15 V2", 168000);

    private final String model;
    private final int price;

    private BikeEnum(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}

