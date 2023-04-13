package com.java8.streamapi;

import java.util.List;

// Implementation of Stream.distinct() to get the distinct elements in the List
public class StreamDistinct {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 3, 4, 5, 7, 8, 8, 2);
        list.stream().distinct().forEach(System.out::println);
    }
    
}
