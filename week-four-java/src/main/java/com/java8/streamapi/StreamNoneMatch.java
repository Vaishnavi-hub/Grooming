package com.java8.streamapi;

import java.util.List;

// implementation of nonMatch() which returns whether no elements of this stream match the provided predicate
public class StreamNoneMatch {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 15, 20, 47, 56);
        boolean fourMultiples = list.stream().noneMatch(n-> n % 4 ==0);
        System.out.println(fourMultiples);

        List<String> list2 = List.of("Java", "React", "SpringBoot", "Cloud Computing", "DevOps");
        boolean stringLength = list2.stream().noneMatch(s -> s.length() < 3);
        System.out.println(stringLength);
    }
}
