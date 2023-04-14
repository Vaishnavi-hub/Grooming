package com.java8.streamapi;

import java.util.List;

public class StreamCount {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        System.out.println(list.stream().count());

        List<Integer> list2 = List.of(1, 2, 5, 7, 3, 4, 7, 3, 5, 2);
        System.out.println(list2.stream().distinct().count());
    }
}
