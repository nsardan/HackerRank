package com.datastructure;

/**
 * Created by neha on 04/07/17.
 */
public class LinkedList {
        static Node head;
        static int size;




    public static void main(String[] args) {


        LinkedList list1 = new LinkedList();
        list1.addNodeAtLast(1);
        list1.addNodeAtLast(3);
        list1.addNodeAtLast(4);
        list1.addNodeAtLast(9);
        list1.addNodeAtLast(2);
        list1.addNodeAtLast(5);
        list1.addNodeAtLast(6);

        list1.printNodes();
        // to add a loop in the linked list
        //  Node n = list1.findNode(9);
        //list1.findNode(6).next = n;
        list1.printMiddleNode();

        System.out.println("Linked has a loop " + list1.hasLoop());

        list1.reverseLinkedList();


    }


    public void clear(){
        head = null;
        size = 0;
    }


    public Node reverseLinkedList(){
        Node prev = null;
        Node curr = head;
        Node next = null;
        while (curr != null ){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        printNodes();
        return head;

    }

    public Node findNode(int data){
        Node current = head;
        while(current != null){
            if(data == current.data){
                System.out.println("Found the node:  ");
                return current;
            }
            current = current.next;
        }

        System.out.println("Not found node");
    return null;
    }

    public Node addNodeAtLast(int value){
        Node curr = head;

        if(head == null){
            Node n = new Node(value);
            head = n;
            size++;
            return n;

        }

        while(curr.next!= null){
            curr = curr.next;
        }

        Node n = new Node(value);
        curr.next = n;
        size++;
        return n;
    }

    public boolean addNodeAtFirst(Node head, int data){
        Node current = head;
        // adding first element
        if(head== null){
            head = new Node(data);
            System.out.println("head node is added");
            size++;
            return true;
        }
        else{

            current.next = new Node(data);
            head = current;

            System.out.println("new node is added");
            size++;
        }


        return true;
    }


    public int size() {

        return this.size;
    }



    public boolean isEmpty() {
        int size = size();
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }


    public void printNodes() {
        Node current = head;
        while (current.next != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println(current.data + " --> Null");
        System.out.println("size is " + size);

    }



    public void printMiddleNode(){
        Node current = head;
        for(int i = 1; i<= size/2 && current.next!= null; i++){
            current = current.next;
        }
        if(size % 2 == 0){
            System.out.println("Middle nodes are :- " + current.next.data + " and  "+ current.data);

        }else{
            System.out.println("Middle node is " + current.data);
        }
    }

    private static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.next = null;
            this.data = data;
        }
    }

    public boolean hasLoop(){
        if(head == null){
            return false;
        }
        Node slow, fast;
        slow = fast = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }


}