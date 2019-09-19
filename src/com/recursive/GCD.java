package com.recursive;

import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b) {
        if (a == 0 || b == 0)
            return a | b;
        else if (a >= b)
            return gcd(a % b, b);
        else
            return gcd(a, b % a);
    }

    public static void main(String[] args) {
        int n, s;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        s = gcd(arr[0], arr[1]);
        for (int i = 2; i < arr.length; i++)
            s = gcd(s, arr[i]);
        System.out.println(s);
    }
}