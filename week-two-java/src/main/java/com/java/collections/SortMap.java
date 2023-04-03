package com.java.collections;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

// Write a program to sort the map value in desc order
class Quote{
    int qId;
    String quote;
    String author;

    public Quote(int qId, String quote, String author) {
        this.qId = qId;
        this.quote = quote;
        this.author = author;
    }    
}

public class SortMap {
    public static void main(String[] args) {
        
        // Creating TreeMap of Quotes    
        Map<Integer,Quote> quoteMap = new TreeMap<Integer,Quote>();

        // Creating Quotes
        Quote quote1 = new Quote(163, "It always seems impossible until it's done.", "Nelson Mandela");
        Quote quote2 = new Quote(146, "It is never too late to be what you might have been.", "George Eliot");
        Quote quote3 = new Quote(391, "Every moment is a fresh beginning.", "T.S. Eliot");

        // Adding Quotes to TreeMap   
        quoteMap.put(1, quote1);  
        quoteMap.put(2, quote2);  
        quoteMap.put(3, quote3);  

        // Print TreeMap entries using forEach() method in natural ordering
        System.out.println("Display TreeMap in Ascending Order");
        for(Map.Entry<Integer, Quote> entry:quoteMap.entrySet()){    
            int key=entry.getKey();  
            Quote quote =entry.getValue();  
            System.out.println(key + " Quote: ");  
            System.out.println("Quote ID: " + quote.qId + " Quote: " + quote.quote + " Author: " + quote.author);   
        }    

        // Creating new TreeMap in Reverse order
        Map<Integer, Quote> sortedMapDesc = new TreeMap<>(
                Collections.reverseOrder());
 
 
        // Adding unsorted map to TreeMap for reverse-order sorting
        sortedMapDesc.putAll(quoteMap);
 
 
        // Print TreeMap entries using forEach() method in Descending Order
        System.out.println("\nDisplay TreeMap in Descending Order");
        for(Map.Entry<Integer, Quote> entry:sortedMapDesc.entrySet()){    
            int key=entry.getKey();  
            Quote quote =entry.getValue();  
            System.out.println(key + " Quote: ");  
            System.out.println("Quote ID: " + quote.qId + " Quote: " + quote.quote + " Author: " + quote.author);   
        }    
    }
    
}
