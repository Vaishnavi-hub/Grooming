package com.java8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// implementation of max() method to get the maximum element of the Stream according to the provided Comparator
public class StreamMax {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 0, 53, -4, 25, -19);
        Optional<Integer> maxElement = list.stream().max(Integer::compare);
        if(maxElement.isPresent()){
            System.out.println("Maximum element: " + maxElement.get());
        }
        else{
            System.out.println("Null");
        }

        // another way
        Optional<Integer> maxElement2 = list.stream().max(Comparator.naturalOrder());
        if(maxElement2.isPresent()){
            System.out.println("Maximum element2: " + maxElement2.get());
        }
        else{
            System.out.println("Null");
        }

        // get min element using Stream.max()
        Optional<Integer> minElement = list.stream().max(Comparator.reverseOrder());
        if(minElement.isPresent()){
            System.out.println("Minimum element: " + minElement.get());
        }
        else{
            System.out.println("Null");
        }

        // find the character with maximum ASCII value
        List<String> charList = List.of("r", "e", "a", "c", "t", "R", "E", "A", "C", "T");
        Optional<String> maxChar = charList.stream().max(Comparator.comparing(String::valueOf));
        if(maxChar.isPresent()){
            System.out.println("Maximum Character: " + maxChar.get());
        }
        else{
            System.out.println("Null");
        }

        // find longest string using Stream.max()
        String[] array = {"Java", "React", "SpringBoot", "Cloud Computing", "DevOps"};
        Optional<String> longestString = Arrays.stream(array).max((str1, str2) -> Integer.compare(str1.length() - 1, str2.length() - 1));
        if(longestString.isPresent()){
            System.out.println("Longest String: " + longestString.get());
        }
        else{
            System.out.println("Null");
        }
    }
}
