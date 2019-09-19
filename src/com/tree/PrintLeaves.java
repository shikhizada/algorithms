package com.tree;

import java.util.Scanner;

public class PrintLeaves {

    private Node root = null;

    private static class Node {
        Node left;
        Node right;
        int data;

        Node(int newData) {
            left = null;
            right = null;
            data = newData;
        }
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null)
            node = new Node(data);
        else if (data < node.data)
            node.left = insert(node.left, data);
        else if (data > node.data)
            node.right = insert(node.right, data);
        return node;
    }

    public void printLeaves() {
        printLeaves(root);
    }

    private void printLeaves(Node node) {
        if (node == null)
            return;
        if (node.left == null && node.right == null)
            System.out.print(node.data + " ");
        printLeaves(node.left);
        printLeaves(node.right);
    }

    public static void main(String[] args) {
        int x;
        PrintLeaves bt = new PrintLeaves();
        Scanner in = new Scanner(System.in);
        while (true) {
            x = in.nextInt();
            if (x == 0)
                break;
            bt.insert(x);
        }
        bt.printLeaves();
    }
}