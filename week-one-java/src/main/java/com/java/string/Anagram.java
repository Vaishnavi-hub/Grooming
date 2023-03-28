package com.java.string;

import java.util.Arrays;
import java.util.Scanner;

// 2. Find two string is anagram
public class Anagram {

    public static void findAnagram(String str1, String str2){
        if(str1.length() == str2.length()){
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            
            //convert string to charArray
            char[] chArr1 = str1.toCharArray();
            char[] chArr2 = str2.toCharArray();

            //sort the charArray to check both charArrays are equal or not
            Arrays.sort(chArr1);
            Arrays.sort(chArr2);

            //If the charArrays are equal, then both strings are anagram
            if(Arrays.equals(chArr1, chArr2)){
                System.out.println("Two strings are anagram");
            }
            //If the charArrays are not equal, then both strings are not anagram
            else{
                System.out.println("Two strings are not anagram");
            }
        }
        else{
            System.out.println("Two strings are not anagram");
        }
    }

    public static void main(String[] args) {
        //Get user inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String1: "); //rtop
        String str1 = sc.nextLine();
        System.out.print("Enter String2: "); //port
        String str2 = sc.nextLine();
        System.out.println("Input Strings: "+ str1 + " & " + str2);
        
        findAnagram(str1, str2); //Two Strings are Anagram
    }
}
