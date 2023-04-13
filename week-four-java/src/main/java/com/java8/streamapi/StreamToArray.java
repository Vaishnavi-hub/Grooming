package com.java8.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

// implementation of toArray() returns an array containing the elements of this stream
public class StreamToArray {
    public static void main(String[] args) {
        Stream<Integer> streamArray = Stream.of(2, 3, 6, 8, 10);
        Object[] arr = streamArray.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
