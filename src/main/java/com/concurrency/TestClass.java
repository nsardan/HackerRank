package com.concurrency;

/**
 * Created by neha on 13/07/17.
 */
public class TestClass {


    static String find_numbers(int digit, int start, int end) {
        StringBuilder result = new StringBuilder("");

        for (int i = start; i <= end; i++) {
            // 1 digit numbers
            if(i< 10){
                if(i%10 == digit)
                    result.append(i).append(" ");
            }
            // 2 digit
            else if(i>= 10 && i<100){
                int t = i/10;
                if(t == digit || i%10 == digit){
                    result.append(i).append(" ");
                }
            }
            // 3 digit
            else{
                int h = i/100;
                int t = h/10;
                int r = h% 10;
                if(h == digit || t == digit || r == digit){
                    result.append(i).append(" ");
                }
            }

        }

        return result.toString();

    }
    public static void main(String[] args) {
        System.out.println(find_numbers(9,1,1000));
        System.out.println(find_numbers(9,4,90));
        System.out.println(find_numbers(1,995,1000));

    }
}
