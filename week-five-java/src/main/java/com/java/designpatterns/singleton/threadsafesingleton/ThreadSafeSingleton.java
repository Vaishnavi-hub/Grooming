package com.java.designpatterns.singleton.threadsafesingleton;

public class ThreadSafeSingleton {

    // singleton pattern for multi-threaded environment
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    // double-checked locking principle
    public static ThreadSafeSingleton getInstance(){
        if(instance == null){
            synchronized(ThreadSafeSingleton.class){
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
