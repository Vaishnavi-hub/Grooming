package com.java.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// Longest Word in Dictionary
public class LongestWord {
    public static String longestWordInDictionary(String[] words) {
        // Sort the words array to maintain the lexicographical order
        Arrays.sort(words);
        Set<String> wordSet = new HashSet<String>();
        String longestWord = "";

        // iterate through each word in the words array
        for (String word : words) {
            // add the word to wordSet if the length of the word is 1 or check the prefix of the already present in the set
            if (word.length() == 1 || wordSet.contains(word.substring(0, word.length() - 1))) {
                wordSet.add(word);
            }
            else{
                continue;
            }

            // maintain the longest word
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "appl", "apply", "apple", "ap"};
        System.out.println(longestWordInDictionary(words));
    }
}
