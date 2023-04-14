package com.java8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

// implementation of min() method to get the minimum element of the Stream according to the provided Comparator
public class StreamMin {
    public static void main(String[] args) {
        List<Integer> list = List.of(5, 0, 53, -4, 25, -19);
        Optional<Integer> minElement = list.stream().min(Integer::compare);
        if(minElement.isPresent()){
            System.out.println("Minimum element: " + minElement.get());
        }
        else{
            System.out.println("Null");
        }

        // another way
        Optional<Integer> minElement2 = list.stream().min(Comparator.naturalOrder());
        if(minElement2.isPresent()){
            System.out.println("Minimum element2: " + minElement2.get());
        }
        else{
            System.out.println("Null");
        }

        // get max element using Stream.min()
        Optional<Integer> maxElement = list.stream().min(Comparator.reverseOrder());
        if(maxElement.isPresent()){
            System.out.println("Maximum element: " + maxElement.get());
        }
        else{
            System.out.println("Null");
        }

        // find the character with minimum ASCII value
        List<String> charList = List.of("r", "e", "a", "c", "t", "R", "E", "A", "C", "T");
        Optional<String> minChar = charList.stream().min(Comparator.comparing(String::valueOf));
        if(minChar.isPresent()){
            System.out.println("Minimum Character: " + minChar.get());
        }
        else{
            System.out.println("Null");
        }

        // find shortest string using Stream.min()
        String[] array = {"Java", "React", "SpringBoot", "Cloud Computing", "DevOps"};
        Optional<String> shortestString = Arrays.stream(array).min((str1, str2) -> Integer.compare(str1.length() - 1, str2.length() - 1));
        if(shortestString.isPresent()){
            System.out.println("Shortest String: " + shortestString.get());
        }
        else{
            System.out.println("Null");
        }
    }
}
