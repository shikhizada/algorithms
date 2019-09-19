package com.dynamic;

import java.util.Scanner;

public class MouseAndCorns {
    public static void main(String[] args) {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        int[][] a = new int[n][m];
        char[] c = new char[200];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = in.nextInt();

        for (int i = n - 2; i >= 0; i--)
            a[i][0] = a[i][0] + a[i + 1][0];
        for (int i = 1; i < m; i++)
            a[n - 1][i] = a[n - 1][i] + a[n - 1][i - 1];
        for (int i = n - 2; i >= 0; i--)
            for (int j = 1; j < m; j++)
                a[i][j] = a[i][j] + Math.max(a[i + 1][j], a[i][j - 1]);

        int i = 0, j = m - 1, k = 0;
        while (i != n - 1 && j != 0) {
            if (a[i + 1][j] > a[i][j - 1]) {
                c[k] = 'F';
                k++;
                i++;
            } else {
                c[k] = 'R';
                k++;
                j--;
            }
        }
        while (i != n - 1) {
            c[k] = 'F';
            k++;
            i++;
        }
        while (j != 0) {
            c[k] = 'R';
            k++;
            j--;
        }

        for (int l = k - 1; l >= 0; l--)
            System.out.print(c[l]);
        System.out.println();
    }
}