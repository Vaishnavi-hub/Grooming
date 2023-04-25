package com.java.designpatterns.structuralpattern.flyweight;

public class Rectangle extends Shape{
    private String label;

    public Rectangle(){
        this.label = "Rectangle";
    }

    public String getLabel(){
        return label;
    }

    @Override
    public void draw(int length, int breadth, String fillColor){
        System.out.println("Drawing a " + fillColor + " color " + label + " with length " + length + " and breadth " + breadth);
    }
}
