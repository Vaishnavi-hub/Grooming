package com.java.collections;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

// Write a program for the custom sort using Comparator in TreeMap
class Employee {

    private String name;
    private int eId;

    public Employee(String name, Integer eId)
    {
        this.name = name;
        this.eId = eId;
    }

    public Integer geteId() {
        return eId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee [name = " + name + ", eId = " + eId + "]";
    }

}

// Comparator that sort elements according to employee name in descending order
class OrderId implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2)
    {
        return e2.getName().compareTo(e1.getName());
    }
}

public class TreeMapComparator {
    public static void main(String[] args)
    {

        // Creating TreeMap
        TreeMap<Employee, Integer> map = new TreeMap<>(new OrderId());

        // Adding key, value to TreeMap
        map.put(new Employee("Keerthana", 1349), 1);
        map.put(new Employee("Ananth", 4432), 2);
        map.put(new Employee("Vinitha", 3671), 3);

        System.out.println("TreeMap Keys sorted in descending order based on Employee Name: ");

        // Print map using Entry
        for (Map.Entry<Employee, Integer> entry :
            map.entrySet()) {
            System.out.println("Key : (" + entry.getKey() + "), Value : " + entry.getValue());
        }
    }
}
