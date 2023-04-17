package com.java8.streamapi;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// implementation of collect() to collect the stream elements
public class StreamCollect {
    public static void main(String[] args) {
        String value = Stream.of("Hello"," ", "World", "!").collect(Collectors.joining());
        System.out.println(value);

        List<Integer> list = List.of(1, 2, 3, 3, 4, 5, 7, 8, 8, 2);
        Set<Integer> resultSet = list.stream().collect(Collectors.toSet());
        System.out.println(resultSet);
    }
}
