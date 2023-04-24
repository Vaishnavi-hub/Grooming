package com.java.designpatterns.creationalpattern.singleton.staticblockinitialization;

public class TestStaticBlockSingleton {
    public static void main(String[] args) {

        // throws error since the constructor is private
        // StaticBlockSingleton instance = new StaticBlockSingleton();

        // get created instance
        StaticBlockSingleton instance1 = StaticBlockSingleton.getInstance();

        StaticBlockSingleton instance2 = StaticBlockSingleton.getInstance();

        // checking both instance1 and instance2 referring to the same single instance created
        System.out.println(instance1 == instance2);
    }
}
