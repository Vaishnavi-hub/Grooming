package com.java.designpatterns.structuralpattern.decorator;

public class SprinkleDecorator extends CakeDecorator{

    public SprinkleDecorator(Cake cake) {
        super(cake);
    }
    
    public void addTopping(){
        super.addTopping();
        System.out.println("Adding sprinkle topping to cake");
    }
}
