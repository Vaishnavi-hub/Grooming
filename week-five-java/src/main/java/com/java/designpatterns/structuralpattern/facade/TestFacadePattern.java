package com.java.designpatterns.structuralpattern.facade;

public class TestFacadePattern {
    public static void main(String[] args) {
        WashingMachineFacade facade = new WashingMachineFacade();
        facade.startWashing();
    }
}
