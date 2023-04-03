package com.java.string;

import java.util.Stack;

// Given a string Str containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
public class ValidString {

    public  static boolean checkString(String str){
        Stack<Character> stack = new Stack<>();
        for( char ch: str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }
            else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }
            else if (ch == ']' && !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println("The input String is " + str);
        boolean isValid = checkString(str);
        System.out.println("The given string is valid :  " + isValid);
    }
}
