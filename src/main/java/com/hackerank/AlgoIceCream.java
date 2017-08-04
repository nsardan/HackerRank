package com.hackerank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by neha on 22/07/17.
 */
public class AlgoIceCream {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int nTrip = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < nTrip; i ++){
           int mDollar = scanner.nextInt();
           int nIceCreams = scanner.nextInt();
           int iceCreamsCostArray[] = new int[nIceCreams];
           for(int j = 0; j < nIceCreams; j++){
               iceCreamsCostArray[j] = scanner.nextInt();
           }
            calculateCostIceCreamForEach(iceCreamsCostArray, mDollar);

       }

    }

    private static void calculateCostIceCreamForEach(int[] iceCreamsCostArray, int maxCost) {

        for(int i = 0; i< iceCreamsCostArray.length; i++){
            int temp = iceCreamsCostArray[i];
            for(int j= i+1; j < iceCreamsCostArray.length; j++){
                if(maxCost == (temp + iceCreamsCostArray[j])){
                    System.out.println((i+1) + " "+ (j+1));
                }

            }
        }
    }
}
