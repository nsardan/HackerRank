package com.hackerank;

import java.util.Scanner;

public class TutorialIntro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int searchInt = scanner.nextInt();
        int number = scanner.nextInt();
        int array[] = new int[number];
        for(int i = 0; i< number; i++){
            array[i] = scanner.nextInt();
        }

        for(int j= 0; j< number; j++){
            if(searchInt == array[j]){
                System.out.println(j);
            }
        }


    }
}
