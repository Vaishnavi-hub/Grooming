package com.java.designpatterns.singleton.cloneablesingleton;

public class TestCloneableSingleton {
    public static void main(String[] args) throws CloneNotSupportedException {

        // get created instance
        CloneableSingleton instance1 = CloneableSingleton.getInstance();
        
        // clone() will throw CloneNotSupportedException
        // CloneableSingleton instance2 = (CloneableSingleton) instance1.clone();

        CloneableSingleton instance2 = CloneableSingleton.getInstance();

        // checking both instance1 and instance2 referring to the same single instance created
        System.out.println(instance1 == instance2); // prints false without readResolve method
    }
}
