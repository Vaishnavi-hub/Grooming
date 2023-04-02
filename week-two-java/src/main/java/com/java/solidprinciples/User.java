package com.java.solidprinciples;

// Implementing Dependency Inversion Principle
public class User {
    public static void main(String[] args) {
        OperationCalculator operation1 = new Addition();
        Calculator calculator = new Calculator(operation1);
        calculator.performOperation(4, 3);
        calculator.display();

        OperationCalculator operation2 = new Subtraction();
        calculator = new Calculator(operation2);
        calculator.performOperation(4, 3);
        calculator.display();

        OperationCalculator operation3 = new Multiplication();
        calculator = new Calculator(operation3);
        calculator.performOperation(4, 3);
        calculator.display();

        OperationCalculator operation4 = new Division();
        calculator = new Calculator(operation4);
        calculator.performOperation(4, 3);
        calculator.display();
    }
}
