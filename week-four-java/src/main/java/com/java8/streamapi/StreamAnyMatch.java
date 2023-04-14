package com.java8.streamapi;

import java.util.stream.Stream;

// implementation of anyMatch() which returns whether any elements of this stream match the provided predicate
public class StreamAnyMatch {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("Java", "Python", "Hadoop", "C#", "C++", "Kotlin");  
        boolean unMatch = stream.anyMatch(s -> s.contains("js"));  
        System.out.println(unMatch);
        Stream<String> stream2 = Stream.of("Java", "Python", "Hadoop", "C#", "C++", "Kotlin");  
        boolean match = stream2.anyMatch(s -> s.startsWith("C"));  
        System.out.println(match);
    }
}
