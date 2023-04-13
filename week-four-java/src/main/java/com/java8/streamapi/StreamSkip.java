package com.java8.streamapi;

import java.util.List;

// implementation of skip() to skip the first N elements in the encounter order
public class StreamSkip {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        list.stream().skip(6).forEach(System.out::println);
    }
}
