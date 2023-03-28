package com.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 6.	Count the Number of Vowel Strings in Range
public class VowelString {

    public static int numOfVowelStrings(List<String> words, int left, int right){
        // Initialize count variable
        int count = 0;

        // Iterate through words array between left and right range value
        for(int i=left; i<=right; i++){
            String word = words.get(i);
            char first = word.charAt(0);
            char last = word.charAt(word.length()-1);

            //Check first and last character of the string is a vowel
            if(first == 'a' || first == 'e' || first == 'i' || first == 'o' || first == 'u'){
                if (last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u') {
                    // If both first and last character are vowel, increase the count by 1
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //Get user inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter set of strings: "); // ["hey","aeo","mu","ooo","artro"]
        List<String> words = new ArrayList<String>();
        String str;
        while(true){
            if(sc.hasNextLine()){
                str = sc.nextLine();
                if(str.isEmpty()){
                    break;
                }
                words.add(str);
            }
            else{
                break;
            }
        }
        System.out.println(words);

        System.out.print("Enter left range: "); // 1
        int left = sc.nextInt();
        System.out.print("Enter right range: "); // 4
        int right = sc.nextInt();
        System.out.println("Range = ["+ left + ", " + right + "]");

        
        System.out.println(numOfVowelStrings(words, left, right)); // 3
    }
}
