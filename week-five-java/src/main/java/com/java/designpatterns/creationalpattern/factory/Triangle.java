package com.java.designpatterns.creationalpattern.factory;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Triangle::draw() method");
    }
}
