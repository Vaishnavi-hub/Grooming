package com.java8.functionalinterface;

// implementation of functional interface
@FunctionalInterface
interface Message3{
    // only one abstract method
    void display(String msg);

    // any number of default methods
    default void printHello(){
        System.out.println("Hello!");
    }
    default void printSomething(String content){
        System.out.println(content);
    }

    // any number of static methods
    static void printHi(){
        System.out.println("Hi!");
    }
    static void printAnything(String content){
        System.out.println(content);
    }
}

public class FunctionalInterfaceDemo3 implements Message3{

    @Override
    public void display(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceDemo3 demo = new FunctionalInterfaceDemo3();
        demo.display("Welcome!");
        demo.printHello();
        Message3.printAnything("Functional Interface");
    }
}
