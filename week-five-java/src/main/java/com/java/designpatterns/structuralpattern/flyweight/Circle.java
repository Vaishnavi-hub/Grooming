package com.java.designpatterns.structuralpattern.flyweight;

public class Circle extends Shape{
    private String label;

    public Circle(){
        this.label = "Circle";
    }

    public String getLabel(){
        return label;
    }

    @Override
    public void draw(int radius, String fillColor){
        System.out.println("Drawing a " + fillColor + " color " + label + " with radius " + radius);
    }
}
