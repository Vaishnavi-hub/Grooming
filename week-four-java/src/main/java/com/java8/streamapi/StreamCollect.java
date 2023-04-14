package com.java8.streamapi;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// implementation of collect() to collect the stream elements
public class StreamCollect {
    public static void main(String[] args) {
        String value = Stream.of("Hello"," ", "World", "!").collect(Collectors.joining());
        System.out.println(value);
    }
}
