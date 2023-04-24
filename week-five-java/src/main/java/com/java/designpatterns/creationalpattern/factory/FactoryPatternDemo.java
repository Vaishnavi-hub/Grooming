package com.java.designpatterns.creationalpattern.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Rectangle and call its draw method.
        Shape shape1 = shapeFactory.getShape(EnumShapes.RECTANGLE);
        shape1.draw();

        //get an object of Square and call its draw method.
        Shape shape2 = shapeFactory.getShape(EnumShapes.SQUARE);
        shape2.draw();

        //get an object of Triangle and call its draw method.
        Shape shape3 = shapeFactory.getShape(EnumShapes.TRIANGLE);
        shape3.draw();
    }
}
