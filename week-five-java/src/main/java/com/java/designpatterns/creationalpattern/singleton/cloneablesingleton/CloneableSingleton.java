package com.java.designpatterns.creationalpattern.singleton.cloneablesingleton;

public class CloneableSingleton implements Cloneable {

    private static volatile CloneableSingleton instance;

    private CloneableSingleton(){}

    public static CloneableSingleton getInstance(){
        if(instance == null){
            synchronized(CloneableSingleton.class){
                if(instance == null){
                    instance = new CloneableSingleton();
                }
            }
        }
        return instance;
    }

    // avoid other class to clone our object
    @Override
    protected Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }
}
