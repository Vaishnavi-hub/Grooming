package com.java.designpatterns.structuralpattern.flyweight;

import java.util.Random;

public class PaintApp {

    private static String[] shapeTypes = {"Line", "Circle", "Rectangle"};
    private static String[] colors = {"Red", "Green", "Blue", "Yellow", "Orange", "Pink", "Violet", "Black", "White"};
    private static String[] styles = {"Solid", "Dotted", "Dashed"};

    public void render(int numOfShapes) {
        Shape shape = null;
        String randomShape = null;

        for(int i = 1; i <= numOfShapes; i++){
            randomShape = getRandomShape();
            shape = ShapeFactory.getShape(randomShape);
            if(randomShape.equalsIgnoreCase("Line")){
                shape.draw(getRandomNumber(), getRandomNumber(), getRandomNumber(), getRandomNumber(), getRandomStyle(), getRandomColor());
            }
            else if(randomShape.equalsIgnoreCase("Circle")){
                shape.draw(getRandomNumber(), getRandomColor());
            }
            else if(randomShape.equalsIgnoreCase("Rectangle")){
                shape.draw(getRandomNumber(), getRandomNumber(), getRandomColor());
            }
        }
    }

    public static String getRandomShape(){
        Random r = new Random();
        int randInt = r.nextInt(shapeTypes.length);
        return shapeTypes[randInt];
    }

    public static String getRandomColor(){
        Random r = new Random();
        int randInt = r.nextInt(colors.length);
        return colors[randInt];
    }

    public static String getRandomStyle(){
        Random r = new Random();
        int randInt = r.nextInt(styles.length);
        return styles[randInt];
    }

    public static int getRandomNumber(){
        Random r = new Random();
        int randInt = r.nextInt(100);
        return randInt;
    }
}
