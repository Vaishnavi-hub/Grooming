package com.java.designpatterns.creationalpattern.singleton.lazyinitialization;

public class TestLazyInitializationSingleton {
    public static void main(String[] args) {

        // throws error since the constructor is private
        // LazyInitializationSingleton instance = new LazyInitializationSingleton();

        // get created instance
        LazyInitializationSingleton instance1 = LazyInitializationSingleton.getInstance();

        LazyInitializationSingleton instance2 = LazyInitializationSingleton.getInstance();

        // checking both instance1 and instance2 referring to the same single instance created
        System.out.println(instance1 == instance2);
    }
}
