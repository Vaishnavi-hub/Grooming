package com.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// implementation of flatMap() which returns a stream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element
public class StreamFlatMap {
    public static void main(String[] args) {
        List<Integer> oddNumList = List.of(1, 3,5);
        List<Integer> evenNumList = List.of(2, 4, 6);
        List<Integer> primeNumList = List.of(7, 11, 13);
        List<List<Integer>> listOfNumbers = List.of(oddNumList, evenNumList, primeNumList);
        System.out.println("List structure before applying flatMap(): "+ listOfNumbers);
        List<Integer> streamOfValues = listOfNumbers.stream().flatMap(list -> list.stream()).collect(Collectors.toList());
        System.out.println("List structure after applying flatMap(): "+ streamOfValues);

        String[][] dataArray = new String[][]{{"a", "b"}, 
		{"c", "d", "e"}, {"f", "g"}, {"h", "i", "j"}};
        List<String> listOfAllChars = Arrays.stream(dataArray)
                    .flatMap(x -> Arrays.stream(x))
                    .collect(Collectors.toList());
        System.out.println("Array structure after applying flatMap(): " + listOfAllChars);
    }
}
