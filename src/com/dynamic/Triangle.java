package com.dynamic;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[][] a = new int[n + 1][n + 1];
        for (int i = 1; i < n + 1; i++)
            for (int j = 1; j < i + 1; j++)
                a[i][j] = in.nextInt();

        for (int i = n - 1; i > 0; i--)
            for (int j = 1; j < i + 1; j++)
                a[i][j] += Math.max(a[i + 1][j], a[i + 1][j + 1]);

        System.out.println(a[1][1]);
    }
}

//A number triangle. Write a program that calculates the highest sum of numbers passed on a route that starts at the
// top and ends somewhere on the base.
// Each step can go either diagonally down to the left or diagonally down to the right.
// The number of rows in the triangle is greater than 1 but less or equal 100.
// The numbers in the triangle, all integers, are between 0 and 99.

// Input
// First given the number of rows in triangle. Next rows describe the triangle itself.

//Output
//Print the maximum sum from top to the base of triangle.