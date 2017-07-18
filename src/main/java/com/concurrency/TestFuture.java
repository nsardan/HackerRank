package com.concurrency;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;
import java.util.concurrent.*;

/**
 * Created by neha on 11/07/17.
 */
public class TestFuture {

    private static final ExecutorService threadPool = Executors.newFixedThreadPool(4);

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Instant first = Instant.now();

        int number = 10000;
        FactorialCalculator task = new FactorialCalculator(number);
        System.out.println("Submitting the task...");

        Future future = threadPool.submit(task);

        System.out.println("Task is submitted");

        while(!future.isDone()){
            System.out.println("Task is not completed yet");
            Thread.sleep(1000);
        }

        System.out.println("Task completed lets check the results");
        long factorial = (Long)future.get();
        System.out.println("Factorial of number : "+ number + " is : " + factorial);
        threadPool.shutdownNow();
        Instant second = Instant.now();
        Duration duration = Duration.between(first,second);
        System.out.println(duration.getNano());

    }


    private static class FactorialCalculator implements Callable {

        private final int number;

        public FactorialCalculator(int number) {
            this.number = number;
        }

        @Override
        public Long call() {
            long output = 0;

            try {
                output = factorial(number);
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception thrown in call method");
            }

            return output;
        }

        private long factorial(int number) throws InterruptedException{
            if(number<0){

                throw new IllegalArgumentException("Number must be greater than zero");

            }
            long result = 1;
            while(number >0){
                Thread.sleep(1);
                result = result * number;
                number--;
            }

            return result;

        }
    }
}
