package com.java8.functionalinterface;

// implementation of functional interface
@FunctionalInterface
interface Message2{
    // single abstract method
    void display(String msg);

    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}

public class FunctionalInterfaceDemo2 implements Message2{

    @Override
    public void display(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceDemo2 demo = new FunctionalInterfaceDemo2();
        demo.display("Hello!");
    }
}
