package com.java8.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student{
    String name;
    int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }    
}

// Implementation of Stream.sorted() to get a stream of elements sorted in their natural order
public class StreamSorted {
    
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 0, 53, -4, 25, -19);

        // ascending order
        System.out.println("Ascending Order");
        list.stream().sorted().forEach(System.out::println);

        // descending order
        System.out.println("Descending Order");
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);

        // sort user defined object
        System.out.println("Sorting Students");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Pooja", 123));
        students.add(new Student("Andal", 569));
        students.add(new Student("Mithun", 786));
        students.stream().sorted((s1, s2) -> s1.name.compareTo(s2.name)).forEach(System.out::println);
    }
}
