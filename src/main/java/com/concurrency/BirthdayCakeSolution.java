package com.concurrency;

import java.util.*;

/**
 * Created by neha on 16/07/17.
 */
public class BirthdayCakeSolution {
    static int birthdayCakeCandles(int n, int[] ar) {

        for(int i = 0; i< n-1 ; i++){
            if(ar[i] > ar[i+1]){
                int temp = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = temp;
            }
        }

        int max = ar[n-1];
        int freq = 1;

        for(int j = 0; j< n-1; j++){
            if(ar[j] == max){
                freq++;
            }
        }

        return freq;
    }

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        int[] ar = { 2, 2, 2, 2, 2};
       int n = 5;
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
