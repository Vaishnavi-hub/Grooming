package com.java8.streamapi;

import java.util.List;

// implementation of forEach() to iterate the elements
public class StreamForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Red ", "Orange ", "Yellow ", "Green ", "Blue ", "Indigo ", "Violet ");
        
        // Sequential Stream
        System.out.println("\nSequential Stream");
        // forEach()
        list.stream().forEach(System.out::print);
        System.err.println();
        // forEachOrdered()
        list.stream().forEachOrdered(color -> System.out.print(color));

        // Parallel Stream
        System.out.println("\nParallel Stream");
        // forEach()
        list.parallelStream().forEach(System.out::print);System.out.println();
        // forEachOrdered()
        list.parallelStream().forEachOrdered(color -> System.out.print(color));
    }
}
