package com.graph;

import java.util.Scanner;

public class Floyd {
    public static void main(String[] args) {
        int n, s = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
                if (arr[i][j] < 0)
                    arr[i][j] = 1000000;
            }

        for (int k = 0; k < n; k++)
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    if (arr[i][j] > arr[i][k] + arr[k][j])
                        arr[i][j] = arr[i][k] + arr[k][j];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (arr[i][j] > s && arr[i][j] < 1000000)
                    s = arr[i][j];
        System.out.println(s);
    }
}