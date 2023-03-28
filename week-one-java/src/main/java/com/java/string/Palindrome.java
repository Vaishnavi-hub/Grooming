package com.java.string;

import java.util.Scanner;

// 3. Find a string is palindrome
public class Palindrome {

    public static void findPalindrome(String str){
        String revStr = "";

        // Loop the string and extract each char and concatenate at the beginning of revStr variable
        for(int i = 0; i < str.length(); i++){
            revStr = str.charAt(i) + revStr;
        }
        System.err.println("Reversed String: " + revStr);

        // If input string and reversed string are equal, then both are palindrome
        if(str.equalsIgnoreCase(revStr)){
            System.out.println("The given string is palindrome");
        }
        // If input string and reversed string are not equal, then both are not palindrome
        else{
            System.out.println("The given string is not a palindrome");
        }
    }

    public static void main(String[] args) {
        // get user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to reverse: "); // malayalam
        String str = sc.nextLine();
        System.out.println("Input String: " + str);
        
        findPalindrome(str); // The given string is palindrome
    }
    
}
