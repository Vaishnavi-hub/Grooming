package com.java.string;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// 7.	Implements the Immutable class which has List & Date attribute?
final class Student {
    private final int rollNum;
    private final String name;
    private final Date dob;
    private List<String> subjects;

    public Student(int rollNum, String name, Date dob, List<String> subjects) {
        this.rollNum = rollNum;
        this.name = name;
        this.dob = new Date(dob.getTime()); 
        this.subjects = new ArrayList<>(subjects);
    }

    public List<String> getSubjects() {
        return new ArrayList<>(subjects);
    }

    public int getRollNum() {
        return rollNum;
    }

    public String getName() {
        return name;
    }

    public Date getDob() {
        return new Date(dob.getTime()); 
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        Date date = new Date();
        List<String> subjects = new ArrayList<>();
        subjects.add("Maths");
        subjects.add("Science");
        subjects.add("Social"); 
        Student student = new Student(2, "Aadvik", date, subjects);
        
        System.out.println(student.getRollNum());
        System.out.println(student.getName());
        System.out.println(student.getDob());
        System.out.println(student.getDob().getTime());
        System.out.println(student.getSubjects());
        
        System.out.println(" \n Modifying attributes \n");
        
        // modifying date and list attribute of immutable class
        student.getDob().setTime(0);
        student.getSubjects().remove(0);
        
        System.out.println(student.getRollNum());
        System.out.println(student.getName());
        System.out.println(student.getDob());
        System.out.println(student.getDob().getTime());
        System.out.println(student.getSubjects());
    }
    
}
