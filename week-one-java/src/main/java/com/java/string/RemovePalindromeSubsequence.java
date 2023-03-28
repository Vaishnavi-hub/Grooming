package com.java.string;

import java.util.Scanner;

// 4. Remove palindrome subsequence
public class RemovePalindromeSubsequence {

    public static int removePalindromeSubSequence(String str){
        if(str.isEmpty()){
            return 0;
        }
        int i = 0, j = str.length()-1;
        while(i < j){
            if(str.charAt(i) == str.charAt(j)){
                i++;
                j--;
            }
            else{
                return 2;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: "); // baabb
        String str = sc.nextLine();
        System.out.println("Input String: " + str);
        
        System.out.println(removePalindromeSubSequence(str)); // 2
    }
}
