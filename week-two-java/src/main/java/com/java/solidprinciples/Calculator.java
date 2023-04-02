package com.java.solidprinciples;

public class Calculator implements DisplayCalculator, ClearCalculator{

    // Implementing Dependency Inversion Principle
    private final OperationCalculator operation;
    private double result;

    public Calculator(OperationCalculator operation) {
        this.operation = operation;
    }

    @Override
    public void clear() {
        result = 0;
    }

    @Override
    public void display() {
        System.out.println("Result: " + result);
    }

    public double performOperation(double num1, double num2) {
        result = operation.calculate(num1, num2);
        return result;
    }

}
