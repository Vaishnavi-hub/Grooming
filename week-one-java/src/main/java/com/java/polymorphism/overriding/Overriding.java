package com.java.polymorphism.overriding;

// program to demonstrate run time polymorphism using method overriding
class Icecream {
    void flavor(){System.out.println("Icecream has many flavors");}  
}

class Chocolate extends Icecream{  
  @Override
  void flavor(){System.out.println("Chocolate flavored Icecream");}   
}  

class Strawberry extends Icecream{  
  @Override
  void flavor(){System.out.println("Strawberry flavored Icecream");}
}
public class Overriding{ 
  public static void main(String args[]){  

    // parent class flavor method
    Icecream icecream = new Icecream();
    icecream.flavor();  

    // child class flavor method
    Chocolate chocolate = new Chocolate();
    chocolate.flavor();

    // upcasting
    Icecream ice = new Strawberry();
    ice.flavor();
  }  
}  
