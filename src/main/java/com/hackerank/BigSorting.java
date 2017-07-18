package com.hackerank;

import java.math.BigInteger;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by neha on 16/07/17.
 */
public class BigSorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }

       String[] sorted=  sortBigArrayString(unsorted);
        printSortedArray(sorted);

    }

    private static void printSortedArray(String[] sorted) {
        for (String element: sorted) {
            System.out.println(element);
        }
    }

    private static String[] sortBigArrayString(String[] array) {

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                    if(o1.length() == o2.length()){
                        return o1.compareTo(o2);
                    }else{
                        return o1.length() - o2.length();
                    }

            }
        };
        Arrays.sort(array, comparator);
        return array;
    }





}
