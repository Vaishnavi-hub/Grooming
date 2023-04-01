package com.java.string;

import java.util.*;

// 9.	Create a pojo and implements the equals and hashcode.
class Product
{
    String name;
    int pId;
    float price;

    Product(String name, int pId, float price)
    {
        this.name = name;
        this.pId = pId;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj)
    {
        // Both objects will be equal if both the object references are referring to the same object.
        if(this == obj)
            return true;
        
        // Returns false if either the passed object is null or the passed object class not equal to the Product class.
        if(obj == null || obj.getClass()!= this.getClass())
            return false;
        
        // type casting of the argument. 
        Product prod = (Product) obj;
        
        // Returns true if all the state values of the passed object matches the class object state values.
        return (prod.name.equals(this.name) && prod.pId == this.pId && prod.price == this.price);
    }

    @Override
    public int hashCode()
    {
        // hashCode method returns pId as a hashcode value.
        return this.pId;
    }
}

public class EqualsHashCode {
    public static void main (String[] args) 
    {
        // creating two Objects with same state
        Product prod1 = new Product("Milk Shake", 101, 120f);
        Product prod2 = new Product("Milk Shake", 101, 120f);
        Product prod3 = new Product("Popcorn", 105, 20f);

        // checking the equality of objects using equals() methods
        if(prod1.equals(prod2)){     
            System.out.println("prod1 & prod2 are equal objects, and their respective hash values are:" + " "+ prod1.hashCode() + " & " + prod2.hashCode());  
        }  

        // checking the equality of objects using equals() methods
        if(!prod1.equals(prod3)){
            System.out.println("prod1 & prod3 are not equal objects, and their respective hash values are:" + " "+ prod1.hashCode() + " & " + prod3.hashCode());  
        }
    }
}
