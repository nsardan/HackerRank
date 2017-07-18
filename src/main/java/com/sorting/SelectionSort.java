package com.sorting;

/**
 * Created by neha on 16/07/17.
 */
public class SelectionSort {

    static int[] arr;



    public static void main(String[] args) {

        int[] test = {2, 3,1,8,4,9,1,2,1};
        displaySelectionsort(test);
        selectionSort(test);
        System.out.println(" ");
        displaySelectionsort(test);
    }

    private static void displaySelectionsort(int[] arr) {
        System.out.println(" ");

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i] + " ");

        }
    }

    public static void selectionSort(int[] array){
        int n = array.length;
        for(int i= 0; i< n; i++){
            int min = i;
            for(int j = i+1; j<n ; j++){
             if(array[j] < array[min])
                min = j;
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
            displaySelectionsort(array);
        }
    }
}
