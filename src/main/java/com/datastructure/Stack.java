package com.datastructure;

/**
 * Created by neha on 04/07/17.
 */
public class Stack {

    Node top;


    public Node peek() {
        if (top != null) {
            return top;
        }

        return null;
    }

    public Node pop() {
        if (top == null) {
            return null;
        } else {
            Node temp = new Node(top.value);
            top = top.next;
            return temp;
        }
    }

    public void push(Node n) {
        if (n != null) {

            n.next = top;
            top = n;

        }
    }

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }
}
