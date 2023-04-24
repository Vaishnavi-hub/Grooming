package com.java.designpatterns.structuralpattern.decorator;

public class PlainCake implements Cake {
    @Override
    public void addTopping() {
        System.out.println("Adding Plain Cake layers");
    }
}
