package com.java8.streamapi;

import java.util.List;

// implementation of map() to get a stream by applying the given function to this stream.
public class StreamMap {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 6, 9, 11, 15);
        list.stream().map(n -> n*3).forEach(System.out::println);
    }
    
}
