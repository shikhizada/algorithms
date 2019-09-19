package com.dynamic;

import java.util.Scanner;

public class ThreeOnes {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] a = new int[n];
        if (n == 1)
            System.out.println(2);
        else if (n == 2)
            System.out.println(4);
        else {
            a[0] = 2;
            a[1] = 4;
            a[2] = 7;
            for (int i = 3; i < n; i++)
                a[i] = a[i - 1] + a[i - 2] + a[i - 3];
            System.out.println(a[n - 1]);
        }
    }
}

// Find the number of sequences of length n, consisting only of zeros and ones, that do not have three one's in a row.