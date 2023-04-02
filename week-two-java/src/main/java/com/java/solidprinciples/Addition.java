package com.java.solidprinciples;

// Implementing Single Responsibility Principle, Open-Closed Principle & Liskov Principle
public class Addition implements OperationCalculator {

    @Override
    public double calculate(double num1, double num2) {
        return num1 + num2;
    }    
}
