package com.java.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 10.	Write a program to implements Compare method.
class Employee {
   String name;
   int id, age;
   Employee(String name, int id, int age) {
      this.name = name;
      this.id = id;
      this.age = age;
   }
}
class IdComparator implements Comparator {
   @Override
   public int compare(Object o1, Object o2) {
      return ((Employee) o1).id - ((Employee) o2).id;
   }
}
class AgeComparator implements Comparator {
   @Override
   public int compare(Object o1, Object o2) {
      return ((Employee) o1).age - ((Employee) o2).age;
   }
}

public class CompareMethod {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        //Insert Employee Details
        list.add(new Employee("Priya", 5679, 27));
        list.add(new Employee("Ananth", 9770, 25));
        list.add(new Employee("Vishal", 1284, 48));
        list.add(new Employee("Akshaya", 3874, 25));
        list.add(new Employee("Keerthana", 2875, 33));

        System.out.println("Before sorting Employee: ");
        for (Employee emp : list) {
            System.out.print("[" + emp.name + ", " + emp.id + ", " + emp.age + "] ");
        }
        //Sort Employee Details using ID
        Collections.sort(list, new IdComparator());

        System.out.println("\n\nAfter sorting Employee using ID: ");
        for (Employee emp : list) {
            System.out.print("[" + emp.name + ", " + emp.id + ", " + emp.age + "] ");
        }

        //Sort Employee Details using Age
        Collections.sort(list, new AgeComparator());

        System.out.println("\n\nAfter sorting Employee using Age: ");
        for (Employee emp : list) {
            System.out.print("[" + emp.name + ", " + emp.id + ", " + emp.age + "] ");
        }
    }
    
}
