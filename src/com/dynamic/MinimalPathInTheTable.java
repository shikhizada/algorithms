package com.dynamic;

import java.util.Scanner;

public class MinimalPathInTheTable {
    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int[][] a = new int[n + 1][m + 1];
        for (int i = 1; i < n + 1; i++)
            for (int j = 1; j < m + 1; j++)
                a[i][j] = in.nextInt();
        for (int i = 2; i <= m; i++)
            a[1][i] += a[1][i - 1];
        for (int i = 2; i <= n; i++)
            a[i][1] += a[i - 1][1];
        for (int i = 2; i <= n; i++)
            for (int j = 2; j <= m; j++)
                a[i][j] += Math.min(a[i][j - 1], a[i - 1][j]);
        System.out.println(a[n][m]);
    }
}