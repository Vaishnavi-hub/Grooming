package com.java.designpatterns.behavioralpattern.templatemethod;

public abstract class HouseTemplate {
    
    //template method (order fixed)
	public final void buildHouse(){
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built");
	}

    //default methods
    private void buildFoundation() {
		System.out.println("Building foundation with cement,iron rods and sand");
	}
	
	public void buildWindows() {
		System.out.println("Building Wooden Frame Windows");
	}

	//methods to be implemented by subclasses
    public abstract void buildPillars();
	public abstract void buildWalls();

}
