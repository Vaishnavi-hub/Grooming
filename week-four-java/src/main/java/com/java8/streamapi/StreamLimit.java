package com.java8.streamapi;

import java.util.List;

// implementation of limit() to limit the number of elements that will be extracted from a stream
public class StreamLimit {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        list.stream().limit(5).forEach(System.out::println);
    }
}
