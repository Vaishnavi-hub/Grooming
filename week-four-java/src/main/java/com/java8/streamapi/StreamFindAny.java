package com.java8.streamapi;

import java.util.List;
import java.util.Optional;

// implementation of findAny() which returns any element from a Stream
public class StreamFindAny {
    public static void main(String[] args) {
        List<Integer> list = List.of(4, 15, 27, 39, 61);
        Optional<Integer> anyNum = list.stream().findAny();
        if (anyNum.isPresent()) {
            System.out.println(anyNum.get());
        }
        else {
            System.out.println("no value");
        }

        List<String> list2 = List.of("Java", "React", "SpringBoot", "Cloud Computing", "DevOps");
        Optional<String> anyString = list2.stream().findAny();
        if (anyString.isPresent()) {
            System.out.println(anyString.get());
        }
        else {
            System.out.println("no value");
        }
    }
}
