package com.java.designpatterns.creationalpattern.singleton.serializedsingleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{

    private static final long serialVersionUID = 1L;

    private static volatile SerializedSingleton instance;

    private SerializedSingleton(){}

    public static SerializedSingleton getInstance(){
        if(instance == null){
            synchronized(SerializedSingleton.class){
                if(instance == null){
                    instance = new SerializedSingleton();
                }
            }
        }
        return instance;
    }

    // avoid serialization problem by implementing readResolve method
    protected Object readResolve(){
        return instance;
    }
}
