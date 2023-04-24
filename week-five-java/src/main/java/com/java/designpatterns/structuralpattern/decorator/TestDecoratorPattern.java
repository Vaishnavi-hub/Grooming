package com.java.designpatterns.structuralpattern.decorator;

public class TestDecoratorPattern {
    public static void main(String[] args) {

        System.out.println("Preparing Cake1........");
        Cake cake1 = new CreamDecorator(new PlainCake());
        cake1.addTopping();

        System.out.println("Preparing Cake2........");
        Cake cake2 = new SprinkleDecorator(new NutsDecorator(new CreamDecorator(new PlainCake())));
        cake2.addTopping();
    }
}
