package com.hackerank;

/**
 * Created by neha on 23/07/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalancedBrackets {

    public static boolean isBalanced(String expression) {
        // check if this is even if not then return false
        if((expression.length() & 1) == 1){
            return false;
        }
        else{
           Stack<Character> stackOfBrackets = new Stack<>();
           char[] brackets = expression.toCharArray();
           for(char s: brackets){
               switch (s){
                   case '(': stackOfBrackets.push(')'); break;
                   case '{': stackOfBrackets.push('}'); break;
                   case '[': stackOfBrackets.push(']'); break;
                       default:
                           if(stackOfBrackets.isEmpty() || s != stackOfBrackets.peek()){
                               return false;
                           }else{
                               stackOfBrackets.pop();
                           }

               }
           }
           return stackOfBrackets.empty();
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}