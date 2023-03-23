package com.java.polymorphism.overloading;

//program to demonstrate compile time polymorphism using method overloading
public class Multiplication {

    // method for multiplying two integers
    void multiply(int num1, int num2)
    {
        int mul = num1 * num2;
        System.out.println(" Multiplication of two integers :" + mul);
    }
 
    // method for multiplying three integers
    void multiply(int num1, int num2, int num3)
    {
        int mul = num1 * num2 * num3;
        System.out.println(" Multiplication of three integers :" + mul);
    }

    // method for multiplying two double numbers
    void multiply(double num1, double num2)
    {
        double mul = num1 * num2;
        System.out.println(" Multiplication of two double numbers :" + mul);
    }
 
    // method for multiplying an integer and a double number
    void multiply(int num1, double num2)
    {
        double mul = num1 * num2;
        System.out.println(" Multiplication of an integer and a double number :" + mul);
    }
    
    public static void main( String[] args )
    {
        Multiplication obj = new Multiplication();
        obj.multiply(12, 5);
        obj.multiply(3, 6, 10);
        obj.multiply(1.2, 0.8);
        obj.multiply(2, 3.5);
    }
}
