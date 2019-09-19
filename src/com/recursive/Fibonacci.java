package com.recursive;

import java.util.Scanner;

public class Fibonacci {

    public static int rec(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 1;
        else
            return rec(n - 1) + rec(n - 2);
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        System.out.println(rec(n));
    }
}