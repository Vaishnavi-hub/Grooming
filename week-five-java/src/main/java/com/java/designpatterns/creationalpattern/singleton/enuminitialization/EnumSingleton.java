package com.java.designpatterns.creationalpattern.singleton.enuminitialization;

// create singleton pattern using enum
// enum handle reflection problem
public enum EnumSingleton {
    INSTANCE;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
