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
        for(int i = 0; i < nTrip; i ++){
           int mDollar = scanner.nextInt();
           int nIceCreams = scanner.nextInt();
           int iceCreamsCostArray[] = new int[nIceCreams];
           for(int j = 0; i< nIceCreams; i++){
               iceCreamsCostArray[j] = scanner.nextInt();
           }
            calculateCostIceCreamForEach(iceCreamsCostArray, mDollar);
/*
           if(minMax.get(0)> minMax.get(1)){
               System.out.println(minMax.get(1)+ " " +minMax.get(0));
           }else
           {

               System.out.println(minMax.get(0)+ " " +minMax.get(1));
           }
*/
       }
      // scanner.close();

    }

    private static void calculateCostIceCreamForEach(int[] iceCreamsCostArray, int maxCost) {

      /*  int min = 0;
        for(int i = 0; i< iceCreamsCostArray.length; i++){
            int a = iceCreamsCostArray[i];
            for(int j = i; j< iceCreamsCostArray.length; j++){
                if(a + iceCreamsCostArray[j] == maxCost){

                }
            }
        }
        return null;*/
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(iceCreamsCostArray[0], 1);

        for(int i = 1; i< iceCreamsCostArray.length; i++){
            Integer an = map.get(maxCost - iceCreamsCostArray[i]);
            if(an == null){
                map.put(iceCreamsCostArray[i], i+1);
            }else{
                System.out.print(i+1 + " ");
            }
        }

       // System.out.println("NEHA");
    }
}
