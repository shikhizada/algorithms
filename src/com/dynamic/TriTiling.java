package com.dynamic;

import java.util.Scanner;

public class TriTiling {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        int[] a = new int[31];
        a[0] = 1;
        a[2] = 3;
        for (int i = 4; i < 31; i += 2)
            a[i] = 4 * a[i - 2] - a[i - 4];
        while (in.hasNext()) {
            n = in.nextInt();
            if (n == -1)
                break;
            System.out.println(a[n]);
        }
    }
}

// In how many ways can you tile a 3 x n rectangle with 2 x 1 dominoes? Here is a sample tiling of a 3 x 12 rectangle.