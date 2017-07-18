package com.stack;

/**
 * Created by neha on 16/07/17.
 */
public interface Queue<T> {
    Queue<T> enqueue(T ele);
    T dequeue();
}
