package com.java8.streamapi;

import java.util.List;

// implementation of filter() to filter stream elements on the basis of given predicate
public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 25, 34, 57, 89, 42, 76);
        list.stream().filter(n -> n%2 == 0).forEach(System.out::println);
    }
}
