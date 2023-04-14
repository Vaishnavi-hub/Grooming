package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;

// implementation of allMatch() which returns whether all elements of this stream match the provided predicate
public class StreamAllMatch {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 16, 20, 48, 56);
        boolean fourMultiples = list.stream().allMatch(n-> n % 4 ==0);
        System.out.println(fourMultiples);

        List<String> list2 = List.of("Java", "React", "SpringBoot", "Cloud Computing", "DevOps");
        boolean stringLength = list2.stream().allMatch(s -> s.length() > 5);
        System.out.println(stringLength);
    }
}
