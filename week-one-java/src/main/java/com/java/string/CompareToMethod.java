package com.java.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 10.	Write a program to implements CompareTo method.
class Food implements Comparable {
   String name;
   int price;
   Food(String name, int price) {
      this.name = name;
      this.price = price;
   }
   //overridden compareTo method
   @Override
   public int compareTo(Object o) {
      return this.price - ((Food) o).price;
   }
}

public class CompareToMethod {
    public static void main(String[] args) {
        List<Food> list = new ArrayList<Food>();
        //Insert Food Details
        list.add(new Food("Briyani", 290));
        list.add(new Food("Dosa", 70));
        list.add(new Food("Chilli Parotta", 50));
        list.add(new Food("Idly", 25));
        list.add(new Food("Fried Rice", 130));

        System.out.println("Before sorting Food: ");
        for (Food f : list) {
            System.out.print("[" + f.name + ", " + f.price + "] ");
        }

        //Sort Food Details
        Collections.sort(list);
        
        System.out.println("\n\nAfter sorting Food: ");
        for (Food f : list) {
            System.out.print("[" + f.name + ", " + f.price + "] ");
        }
    }
}
