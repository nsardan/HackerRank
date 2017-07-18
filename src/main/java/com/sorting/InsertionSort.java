package com.sorting;

/**
 * Created by neha on 16/07/17.
 * Sort using a pivot element
 */
public class InsertionSort {

    static int[] array;
    public static void main(String[] args) {

    }

    public void insertionSort(int[] arr){

        for(int i=1; i< arr.length; i++){
            int index = arr[i];
            int j = i;
            while(j>0 && arr[j-1]> index){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = index;

        }
        array = arr;
    }
}
