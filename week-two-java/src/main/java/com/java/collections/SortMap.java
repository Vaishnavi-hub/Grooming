package com.java.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortMap {
    public static void main(String[] args) {

        // Creating HashMap
        Map<String, Integer> hashmap = new HashMap<>();

        // Adding elements to HashMap
        hashmap.put("Briyani", 230);
        hashmap.put("Fried Rice", 130);
        hashmap.put("Egg Parotta", 120);
        hashmap.put("Dosa", 60);
        hashmap.put("Chocolate Milkshake", 120);
        hashmap.put("Sizzling Brownie", 230);


        // Print the elements before sorting
        System.out.println("HashMap elements before sorting:");
        hashmap.forEach((key, value) -> System.out.println(key + " -> " + value));

        // Sorting in the reversed order
        System.out.println("\nHashMap elements after sorting in decreasing order based on food price:");

        // Sort the map value using stream().sorted api along with comparingByValue().reversed() method in Map.Entry
        hashmap.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach((food) -> System.out.println(food.getKey() + " -> " + food.getValue()));
    }
    
}
