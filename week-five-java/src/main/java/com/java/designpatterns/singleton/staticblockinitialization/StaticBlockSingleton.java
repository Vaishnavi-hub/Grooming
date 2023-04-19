package com.java.designpatterns.singleton.staticblockinitialization;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;

    // creating instance in static block
    static{
        try{
            instance = new StaticBlockSingleton();
        } catch(Exception e){
            System.out.println("Exception occurred when creating singleton instance");
        }
    } 
    
    private StaticBlockSingleton(){

    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
