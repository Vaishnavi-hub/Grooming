package com.java.designpatterns.creationalpattern.singleton.eagerinitialization;

public class TestEagerInitializationSingleton {
    public static void main(String[] args) {

        // throws error since the constructor is private
        // EagerInitializationSingleton instance = new EagerInitializationSingleton();

        // get created instance
        EagerInitializationSingleton instance1 = EagerInitializationSingleton.getInstance();

        EagerInitializationSingleton instance2 = EagerInitializationSingleton.getInstance();

        // checking both instance1 and instance2 referring to the same single instance created
        System.out.println(instance1 == instance2);
    }
}
