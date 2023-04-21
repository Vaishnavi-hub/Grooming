package com.java.designpatterns.prototype;

public class TestPrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee();
        emp1.setId(101);
        emp1.setName("Keerthana");
        emp1.setWork(new Work());

        // creating object from emp1 using clone
        Employee emp2 = emp1.clone();
        
        // creating object from emp1 using copy constructor
        Employee emp3 = new Employee(emp1);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
    }
}
