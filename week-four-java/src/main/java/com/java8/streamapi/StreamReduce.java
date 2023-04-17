package com.java8.streamapi;

import java.util.List;
import java.util.Optional;

// implementation of reduce() perform operations where a stream reduces to single resultant value
public class StreamReduce {
    public static void main(String[] args) {
        List<Integer> numList = List.of(3, 8, -4, 9, 15);
        int sum = numList.stream().reduce(0, (num1, num2) -> num1 + num2);
        System.out.println("Sum of all numbers in the list: " + sum);

        List<String> stringList = List.of("Java", "Python", "ReactJs", "C#", "C++", "Kotlin");
        Optional<String> longestString = stringList.stream().reduce((str1, str2) -> str1.length() > str2.length() ? str1 : str2);
        if(longestString.isPresent()){
            System.out.println("Longest word in the list: " + longestString.get());
        }
        else{
            System.out.println("No value");
        }
    }
}
