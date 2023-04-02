package com.java.solidprinciples;

// Implementing Single Responsibility Principle, Open-Closed Principle & Liskov Principle
public class Division implements OperationCalculator{

    @Override
    public double calculate(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }

        return num1 / num2;
    }
    
}
