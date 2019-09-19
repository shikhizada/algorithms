package com.tree;

import java.util.Scanner;

public class PreInPost {
    public static int search(String s, char x, int n) {
        for (int i = 0; i < n; i++)
            if (s.charAt(i) == x)
                return i;
        return -1;
    }

    public static void printPostOrder(String pre, String in, int n) {
        int root = search(in, pre.charAt(0), n);
        String tempPre, tempIn;
        if (root != 0) {
            tempPre = pre.substring(1);
            printPostOrder(tempPre, in, root);
        }
        if (root != n - 1) {
            tempPre = pre.substring(root + 1);
            tempIn = in.substring(root + 1);
            printPostOrder(tempPre, tempIn, n - root - 1);
        }
        System.out.print(pre.charAt(0));
    }

    public static void main(String[] args) {
        int c, n;
        String pre, in;
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            n = sc.nextInt();
            pre = sc.next();
            in = sc.next();
            printPostOrder(pre, in, n);
            System.out.println();
        }
    }
}