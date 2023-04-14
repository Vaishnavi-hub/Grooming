package com.java8.streamapi;

import java.util.List;
import java.util.Optional;

// implementation of findFirst() which returns an Optional describing the first element of this stream
public class StreamFindFirst {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 15, 27, 39, 61);
        Optional<Integer> firstNum = list.stream().findFirst();
        if (firstNum.isPresent()) {
            System.out.println(firstNum.get());
        }
        else {
            System.out.println("no value");
        }

        List<String> list2 = List.of("Java", "React", "SpringBoot", "Cloud Computing", "DevOps");
        Optional<String> firstString = list2.stream().findFirst();
        if (firstString.isPresent()) {
            System.out.println(firstString.get());
        }
        else {
            System.out.println("no value");
        }
    }
}
