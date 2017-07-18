package com.datastructure;

/**
 * Created by neha on 04/07/17.
 */
public class Queue {

    Node first, last;

    public void enQueue(Node n){
        if(first == null){
            first = n;
            last = first;
        }else{
            last.next = n;
            last = n;
        }

    }

    public Node deQueue(){
        if(first == null){
            return null;
        }else{
            Node n = new Node(first.value);
            first = first.next;
            return n;
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

    public static void main(String args1[])
    {
        System.out.println("First main");

    }
    public static void main(String arg)
    {
        System.out.println("Second main");

    }




}
