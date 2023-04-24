package com.java.designpatterns.structuralpattern.decorator;

public class NutsDecorator extends CakeDecorator{

    public NutsDecorator(Cake cake) {
        super(cake);
    }
    
    public void addTopping(){
        super.addTopping();
        System.out.println("Adding nuts topping to cake");
    }
}
