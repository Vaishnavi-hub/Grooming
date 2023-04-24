package com.java.designpatterns.structuralpattern.facade;

public class WashingMachineFacade {
    private Washing washing;
    private Rinsing rinsing;
    private Spinning spinning;
    
    public WashingMachineFacade(){
        washing = new Washing();
        rinsing = new Rinsing();
        spinning = new Spinning();
    }

    public void startWashing(){
        System.out.println("Washing Machine started washing the clothes......");
        washing.wash();
        rinsing.rinse();
        spinning.spin();
        System.out.println("Washing Machine ended washing the clothes......");
    }
}
