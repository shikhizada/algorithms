package com.dynamic;

import java.util.Scanner;

public class NumberOfOnes {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] a = new int[n + 1];
        a[1] = 1;
        for (int i = 2; i <= n; i++) {
            a[i] = i;
            for (int j = 1; 2 * j <= i; j++)
                if (a[j] + a[i - j] < a[i])
                    a[i] = a[j] + a[i - j];
            for (int j = 2; j * j <= i; j++)
                if (i % j == 0)
                    if (a[j] + a[i / j] < a[i])
                        a[i] = a[j] + a[i / j];
        }
        System.out.println(a[n]);
    }
}

// In arithmetic expression you are allowed to use the number 1, operations of addition, multiplication and parenthesis.
// What is the minimum number of ones you need to obtain the positive integer n?