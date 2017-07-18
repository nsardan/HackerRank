package com.datastructure;

/**
 * Created by neha on 12/07/17.
 */
public class FlatLinkedList {
        Node head;



        static class Node{
            int value;
            Node right, down;
            Node(int value){
                this.value = value;
            }
        }

        Node merge(Node a, Node b){
            if(a == null){
                return b;
            }
            if(b == null){
                return a;
            }
            Node result;
            if(a.value < b.value){
                result = a;
                result.down = merge(a.down, b);
            }
            else{
                result = b;
                result.down = merge(a, b.down);
            }
            return result;
        }


        Node push(Node head_ref, int value){
            Node new_node = new Node(value);
            new_node.down = head_ref;
            head_ref = new_node;
            return head_ref;
        }

        void printList(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.value + " ");
                temp = temp.down;
            }
            System.out.println();
        }

        Node flatten (Node root){
            if(root == null || root.right == null){
                return root;
            }

            root.right = flatten(root.right);

            root = merge(root, root.right);


            return root;


        }

    public static void main(String[] args) {
        FlatLinkedList flat = new FlatLinkedList();
           /* Let us create the following linked list
            5 -> 10 -> 19 -> 28
            |    |     |     |
            V    V     V     V
            7    20    22    35
            |          |     |
            V          V     V
            8          50    40
            |                |
            V                V
            30               45
        */

        flat.head = flat.push(flat.head, 30);
        flat.head = flat.push(flat.head, 8);
        flat.head = flat.push(flat.head, 7);
        flat.head = flat.push(flat.head, 5);

        flat.head.right = flat.push(flat.head.right, 20);
        flat.head.right = flat.push(flat.head.right, 10);

        flat.head.right.right = flat.push(flat.head.right.right, 50);
        flat.head.right.right = flat.push(flat.head.right.right, 22);
        flat.head.right.right = flat.push(flat.head.right.right, 19);

        flat.head.right.right.right = flat.push(flat.head.right.right.right, 45);
        flat.head.right.right.right = flat.push(flat.head.right.right.right, 40);
        flat.head.right.right.right = flat.push(flat.head.right.right.right, 35);
        flat.head.right.right.right = flat.push(flat.head.right.right.right, 28);


        flat.head = flat.flatten(flat.head);
        flat.printList();





    }

}
