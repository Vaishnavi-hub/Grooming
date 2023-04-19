package com.java.designpatterns.singleton.threadsafesingleton;

public class TestThreadSafeSingleton {
    public static void main(String[] args) {

        // get created instance
        ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();

        ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();

        // checking both instance1 and instance2 referring to the same single instance created
        System.out.println(instance1 == instance2);
    }
}
