package com.java8.functionalinterface;

// implementation of functional interface
@FunctionalInterface
interface Message{
    // only one abstract method
    void display(String msg);
}

public class FunctionalInterfaceDemo implements Message{

    @Override
    public void display(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo();
        demo.display("Hello!");
    }
}
