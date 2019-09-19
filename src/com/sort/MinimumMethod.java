package com.sort;

import java.util.Scanner;

public class MinimumMethod {
    public static void main(String[] args) {
        int n, x, imin, temp, k = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        x = arr[0];
        for (int i = 0; i < n - 1; i++) {
            imin = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[imin])
                    imin = j;
            if (arr[i] != arr[imin]) {
                temp = arr[i];
                arr[i] = arr[imin];
                arr[imin] = temp;
                if (arr[imin] == x || arr[i] == x)
                    k++;
            }
        }
        System.out.println(k);
    }
}