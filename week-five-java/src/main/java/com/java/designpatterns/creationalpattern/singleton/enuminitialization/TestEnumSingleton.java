package com.java.designpatterns.creationalpattern.singleton.enuminitialization;

public class TestEnumSingleton {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println(instance.getName());
        instance.setName("Singleton Pattern");
        System.out.println(instance.getName());
    }
}
