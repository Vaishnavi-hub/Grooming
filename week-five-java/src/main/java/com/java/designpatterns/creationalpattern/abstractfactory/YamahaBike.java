package com.java.designpatterns.creationalpattern.abstractfactory;

public class YamahaBike implements Bike {
    @Override
    public void ride() {
        System.out.println("Riding a Yamaha Bike");
    }
}