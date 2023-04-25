package com.java.designpatterns.structuralpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String, Shape> shapes = new HashMap<>();
    
    public static Shape getShape(String type){
        Shape shape = null;
        if(shapes.get(type) != null){
            shape = shapes.get(type);
        }
        else { 
            if(type.equalsIgnoreCase("Line")){
                shape = new Line();
            }
            else if(type.equalsIgnoreCase("Circle")){
                shape = new Circle();
            }
            else if(type.equalsIgnoreCase("Rectangle")){
                shape = new Rectangle();
            }
            shapes.put(type, shape);
        }
        return shape;
    }
}
