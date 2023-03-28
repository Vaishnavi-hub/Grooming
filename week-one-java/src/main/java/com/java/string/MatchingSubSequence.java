package com.java.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 5.	Find the Number of matching subsequences
public class MatchingSubSequence {

    public static int numOfMatchingSubSeq(String str, List<String> words){
        int count = 0;
        int i, j;
        
        // Iterate through each strings in words array
        for(String word : words) {
            i = 0; j = 0;
            while(i < str.length() && j < word.length()){
                // check the characters of string match the characters in word string
                if(str.charAt(i) == word.charAt(j)){
                    j++;
                }
                i++;
            }
            /* if the iterable j variable value matches the length of the word variable, 
               then word is subsequence of string variable */
            if(j == word.length()){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Get user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: "); // abcde
        String str = sc.nextLine();

        System.out.print("Enter set of strings: "); // ["a","bb","acd","ace"]
        List<String> words = new ArrayList<String>();
        String word;
        while(true){
            if(sc.hasNextLine()){
                word = sc.nextLine();
                if(word.isEmpty()){
                    break;
                }
                words.add(word);
            }
            else{
                break;
            }
        }
        System.out.println(numOfMatchingSubSeq(str, words)); // 3
    }
    
}
