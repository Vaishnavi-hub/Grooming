package com.java.string;

import java.util.ArrayList;

// Given a string s, find the length of the longest substring without repeating characters.
public class LongestSubstring {
    public static int calculateLength(String s){
        int len = 0;
        int strlen = s.length();
        ArrayList<Character> visited = new ArrayList();
        for(int i = 0; i < strlen; i++){
            for(int j = i; j < strlen; j++) {
                if(visited.contains((s.charAt(j)))){
                    visited.clear();
                    break;
                }
                else{
                    visited.add((s.charAt(j)));
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("The input String is " + s);
        int length = calculateLength(s);
        System.out.println("The length of the longest substring without repeating character is " + length);
    }
}
