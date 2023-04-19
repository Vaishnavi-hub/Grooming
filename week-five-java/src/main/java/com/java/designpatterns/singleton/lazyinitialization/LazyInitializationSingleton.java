package com.java.designpatterns.singleton.lazyinitialization;

public class LazyInitializationSingleton {
    
    private static LazyInitializationSingleton instance;
    
    private LazyInitializationSingleton(){

    }

    // creating instance only when getInstance method is called
    public static LazyInitializationSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }
}
