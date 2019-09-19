package com.tree;

import java.util.Scanner;

public class SecondMaximum {

    private Node root = null;
    private int fmax, smax, k = 0;

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

    public int secondMax() {
        fmax = root.data;
        return secondMax(root);
    }

    private int secondMax(Node node) {
        if (node.right != null && k == 0) {
            smax = fmax;
            fmax = node.right.data;
            secondMax(node.right);
        } else if (node.left != null && k == 0) {
            k = 1;
            smax = node.left.data;
            secondMax(node.left);
        } else if (node.right != null && k == 1) {
            smax = node.right.data;
            secondMax(node.right);
        }
        return smax;
    }

    public static void main(String[] args) {
        int x;
        SecondMaximum bt = new SecondMaximum();
        Scanner in = new Scanner(System.in);
        while (true) {
            x = in.nextInt();
            if (x == 0)
                break;
            bt.insert(x);
        }
        System.out.println(bt.secondMax());
    }
}