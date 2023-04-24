package com.java.designpatterns.creationalpattern.prototype;

public class TestPrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException {
        Course course1 = new Course();
        course1.setId(101);
        course1.setName("Keerthana");
        course1.setReview(new Review());

        // creating object from emp1 using clone
        Course course2 = course1.clone();
        
        // creating object from emp1 using copy constructor
        Course course3 = new Course(course1);

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
    }
}
