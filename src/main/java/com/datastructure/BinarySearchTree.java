package com.datastructure;

import java.util.Scanner;

/**
 * Created by neha on 14/07/17.
 */
public class BinarySearchTree {

    TreeNode root;


    public void insert(int key){

        // put a null check or not
        root = insertRec(root, key);
        System.out.println("Inserted :- "+ key);

    }


    public TreeNode insertRec(TreeNode node, int key){
        //if root is null it comes here for first time
        if(node == null){
            node = new TreeNode(key);
            return node;
        }

        // goes to the left
        if(key < node.value){
            node = insertRec(node.left, key);
        }

        // goes to the right
        if(key> node.value){
            node = insertRec(node.right, key);
        }

        return node;

    }


    public void delete(int key){
        root = deleteRec(root, key);

    }

    public TreeNode deleteRec(TreeNode node, int key){


      // base case when tree is empty
        if(node == null){
            return node;
        }

        if(key < node.value){
            node = deleteRec(node.left, key);
        }

        else if(key > node.value){
            node = deleteRec(node.right, key);
        }
// when you reach the node
        else{

            // case 1: node is a leaf and has no child
            // case 2: node to be deleted has one node child

            if(node.left == null){
                return node.right;
            }
            else if(node.right == null){
                return node.left;

            }
            else{
                node.value = minValue(node.right);

                node.right = deleteRec(node.right, node.value);

            }
        }
        return node;
    }


    public int minValue(TreeNode node){
        int min_value = node.value;
            if(node.left.value < min_value){
                minValue(node.left);
            }

        return min_value;
    }


    public TreeNode search(int key){

        return null;
    }

    public void printPreOrderTraverse(){ printPreOrderTraverse(root);}
    public void printPreOrderTraverse(TreeNode node){
        if(root == null){
            // you have reached the leaf of the tree
            return;
        }
        printPreOrderTraverse(root.left);
        printPreOrderTraverse(root.right);
        System.out.println(root.value + " ");


    }

    public void printPostOrderTraverse(){ printPostOrderTraverse(root);}

    public void printPostOrderTraverse(TreeNode node){
        if(root == null){
            // you have reached the leaf of the tree
            return;
        }
        printPostOrderTraverse(root.left);
        printPostOrderTraverse(root.right);
        System.out.println(root.value + " ");


    }

    public void printInOrderTraverse(){ printInOrderTraverse(root);}
    public void printInOrderTraverse(TreeNode root){

        if(root == null){
            // you have reached the leaf of the tree
            return;
        }
        printInOrderTraverse(root.left);
        System.out.println(root.value + " ");
        printInOrderTraverse(root.right);

    }


    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the given tree");
        tree.printInOrderTraverse();

        System.out.println("\nDelete 20");
        tree.delete(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.printInOrderTraverse();

        System.out.println("\nDelete 30");
        tree.delete(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.printInOrderTraverse();

        System.out.println("\nDelete 50");
        tree.delete(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.printInOrderTraverse();
    }

    private static class TreeNode{
        TreeNode left, right;
        int value;

        TreeNode(int value){
            this.value = value;
            this.left = this.right=  null;
        }

    }
}
