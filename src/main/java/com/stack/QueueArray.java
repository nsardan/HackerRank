package com.stack;

import java.util.HashSet;

/**
 * Created by neha on 16/07/17.
 */
public class QueueArray<T> implements Queue<T> {

    private T[] array;

    private int total, first, next;

    public QueueArray() {
        array = (T[])new Object[2];
    }


    private void resize(int capacity){
        T[] temp = (T[]) new Object[capacity];

        for(int i=0; i< total; i++){
            temp[i] = array[(first+i) % array.length];
        }

        array = temp;
        first = 0;
        next = total;




    }

    @Override
    public Queue enqueue(T ele) {
        if(array.length == total)
            resize(array.length*2);

        array[next++] = ele;


        return null;
    }

    @Override
    public T dequeue() {
        return null;
    }
}
