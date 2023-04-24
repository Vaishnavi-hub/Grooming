package com.java.designpatterns.structuralpattern.decorator;

public class CreamDecorator extends CakeDecorator {

    public CreamDecorator(Cake cake) {
        super(cake);
    }
    
    public void addTopping(){
        super.addTopping();
        System.out.println("Adding cream layer to cake");
    }
}
