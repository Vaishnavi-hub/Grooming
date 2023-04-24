package com.java.designpatterns.creationalpattern.factory;

public class ShapeFactory {
    public Shape getShape(EnumShapes shape){
        if(shape == null){
            return null;
        }
        else if(shape == EnumShapes.RECTANGLE){
            return new Rectangle();
        }
        else if(shape == EnumShapes.SQUARE){
            return new Square();
        }
        else if(shape == EnumShapes.TRIANGLE){
            return new Triangle();
        }
        return null;
    }
}
