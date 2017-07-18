package com.sorting;

/**
 * Created by neha on 16/07/17.
 */
public class BubbleSort {

    static int[] arr;


    public static void main(String[] args) {
        int[] test = {2, 3,1,8,4,9,1,2,1};
        bubbleSort(test);
        displayBubblesort(arr);

    }

    private static void displayBubblesort(int[] arr) {
        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");

        }
    }

    static void bubbleSort(int[] array){
        int n = array.length;


        for(int i = n-1; i>1; i-- ){

            for(int j = 1; j<= i; j++){
                if(array[j-1] > array[j]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }

            }

        }

        arr = array;
    }

}
