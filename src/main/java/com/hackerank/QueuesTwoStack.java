package com.hackerank;

import java.util.Scanner;
import java.util.Stack;

public class QueuesTwoStack{



public static class MyQueue<T> {
    Stack<T> stackNewestOnTop = new Stack<T>();
    Stack<T> stackOldestOnTop = new Stack<T>();

    public void enqueue(T value) { // Push onto newest stack
        if(stackOldestOnTop.isEmpty()){
            stackOldestOnTop.push(value);
        }else{
            //empty the stack1
            while(!stackOldestOnTop.isEmpty()){

                stackNewestOnTop.push(stackOldestOnTop.pop());

            }
            //now add integer
            stackOldestOnTop.push(value);
            while(!stackNewestOnTop.isEmpty()){

                stackOldestOnTop.push(stackNewestOnTop.pop());

            }
        }
    }

    public T peek() {
        if(stackOldestOnTop.isEmpty()){
            System.exit(0);
        }
        return stackOldestOnTop.peek();
    }

    public T dequeue() {
        if(stackOldestOnTop.isEmpty()){
            System.exit(0);
        }
        return stackOldestOnTop.pop();
    }
}


    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }
}
