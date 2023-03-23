package com.java.autoboxingunboxing;

import java.util.ArrayList;

//program to demonstrate autoboxing and unboxing
public class Main {
    public static void main(String[] args) {

      ArrayList<Character> list = new ArrayList<>();

      // autoboxing
      list.add('a');
      list.add('t');
      System.out.println("Autoboxing - ArrayList: " + list);


      // unboxing
      char ch = list.get(0);
      System.out.println("Unboxing - char: " + ch);

      // another example
      Integer i = 10;
      int val = i;
      i = val + 15;
      System.out.println(i+ " " +val);
   }
}
