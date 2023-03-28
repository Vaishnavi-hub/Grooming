package com.java.string;

import java.util.Scanner;

// 1. Reverse a string without using jdk api & without extra space.
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to reverse: "); // program
        String str = sc.nextLine();
        System.out.println("Input String: " + str);
        String revStr = "";

        /*Loop the string and extract each char and 
        concatenate at the beginning of revStr variable*/
        for(int i = 0; i < str.length(); i++){
            revStr = str.charAt(i) + revStr;
        }
        System.out.println("Reversed String: " + revStr); // margorp
    }
    
}
