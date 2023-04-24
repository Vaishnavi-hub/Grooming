package com.java.designpatterns.structuralpattern.decorator;

public class CakeDecorator implements Cake {

    private Cake cake;

    public CakeDecorator(Cake cake){
        this.cake = cake;
    }

    @Override
    public void addTopping() {
        cake.addTopping();
    }
    
}
