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

// Comparator that custom sort elements according to employee name in ascending order
class OrderName implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2)
    {
        return e1.getName().compareTo(e2.getName());
    }
}

// Comparator that custom sort elements according to employee id in ascending order
class OrderId implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2)
    {
        return e1.geteId() - e2.geteId();
    }
}

public class TreeMapComparator {
    public static void main(String[] args)
    {

        // Creating TreeMap
        TreeMap<Employee, Integer> map = new TreeMap<>(new OrderName());

        // Adding key, value to TreeMap
        map.put(new Employee("Keerthana", 1349), 1);
        map.put(new Employee("Ananth", 4432), 2);
        map.put(new Employee("Vinitha", 3671), 3);

        System.out.println("TreeMap Keys sorted in ascending order based on Employee Name: ");
        // Iterator and print map using entrySet
        for (Map.Entry<Employee, Integer> entry :
            map.entrySet()) {
            System.out.println("Key : (" + entry.getKey() + "), Value : " + entry.getValue());
        }

        TreeMap<Employee, Integer> map2 = new TreeMap<>(new OrderId());

        map2.putAll(map);

        System.out.println("\nTreeMap Keys sorted in ascending order based on Employee ID: ");
        // Iterator and print map using entrySet
        for (Map.Entry<Employee, Integer> entry :
            map2.entrySet()) {
            System.out.println("Key : (" + entry.getKey() + "), Value : " + entry.getValue());
        }
    }
}
