package com.java.designpatterns.structuralpattern.flyweight;

public class Line extends Shape{
    private String label;

    public Line(){
        this.label = "Line";
    }

    public String getLabel(){
        return label;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2, String lineStyle, String fillColor){
        System.out.println("Drawing a " + lineStyle + " " + fillColor + " " + label + " with coordinates (" + x1 + ", " + y1 + ") & " + "(" + x2 + ", " + y2 + ")");
    }

}
