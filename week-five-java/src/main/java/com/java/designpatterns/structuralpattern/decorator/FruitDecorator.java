package com.java.designpatterns.structuralpattern.decorator;

public class FruitDecorator extends CakeDecorator{

    public FruitDecorator(Cake cake) {
        super(cake);
    }

    public void addTopping(){
        super.addTopping();
        System.out.println("Adding fruit topping to cake");
    }
}
