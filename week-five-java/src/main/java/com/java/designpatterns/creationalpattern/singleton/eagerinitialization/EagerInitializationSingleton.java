package com.java.designpatterns.creationalpattern.singleton.eagerinitialization;

public class EagerInitializationSingleton {
    
    // creating instance at class loading time itself
    private static EagerInitializationSingleton instance = new EagerInitializationSingleton();
    
    private EagerInitializationSingleton(){

    }

    public static EagerInitializationSingleton getInstance(){
        return instance;
    }
}
