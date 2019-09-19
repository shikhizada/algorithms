package com.tree;

import java.util.Scanner;

public class BinaryTree {

    private Node root;

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

    public void BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private Node insert(Node node, int data) {
        if (node == null)
            node = new Node(data);
        else if (data <= node.data)
            node.left = insert(node.left, data);
        else
            node.right = insert(node.right, data);
        return node;
    }

    public int size() {
        return size(root);
    }

    private int size(Node node) {
        if (node == null)
            return 0;
        else
            return size(node.left) + 1 + size(node.right);
    }

    public static void main(String[] args) {
        int x;
        BinaryTree bt = new BinaryTree();
        Scanner in = new Scanner(System.in);
        while (true) {
            x = in.nextInt();
            if (x == 0)
                break;
            bt.insert(x);
        }
        System.out.println(bt.size());
    }
}