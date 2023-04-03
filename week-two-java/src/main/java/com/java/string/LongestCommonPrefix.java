package com.java.string;

// Write a function to find the longest common prefix string amongst an array of strings
public class LongestCommonPrefix {
    public  static  String longCommonPrefix(String[] strArr){

        StringBuilder longestCommonPrefix = new StringBuilder();

        if (strArr == null || strArr.length == 0) {
            return longestCommonPrefix.toString();
        }
        // Find the minimum length string from the array
        int minLength = strArr[0].length();
        for (int i = 1; i < strArr.length; i++) {
            minLength = Math.min(minLength, strArr[i].length());
        }

        if(minLength == 0){
            return longestCommonPrefix.toString();
        }

        for (int i = 0; i < minLength; i++) {
            // Get the current character from first string
            char current = strArr[0].charAt(i);

            // Checking if current character is common in other strings
            for (String str : strArr) {
                if (str.charAt(i) != current) {
                    return longestCommonPrefix.toString();
                }
            }
            // appending the common character to longestCommonPrefix varaible
            longestCommonPrefix.append(current);
        }
        return longestCommonPrefix.toString();
    }

    public static void main(String[] args) {
        String[] strArr = {"flower","flow","flight"};
        System.out.println("The input list is " + strArr);
        String longCommonPrefix = longCommonPrefix(strArr);
        System.out.println("the longest common prefix string amongst an array of strings is " + longCommonPrefix);
    }
}
