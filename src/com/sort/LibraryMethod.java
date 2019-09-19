package com.sort;

import java.util.Scanner;

public class LibraryMethod {
    public static void main(String[] args) {
        int n, temp, j, k;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        for (int i = 1; i < n; i++) {
            k = 0;
            j = i;
            while (j > 0) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    j--;
                    k = 1;
                } else
                    break;
            }
            if (k == 1) {
                for (int u = 0; u < n - 1; u++)
                    System.out.print(arr[u] + " ");
                System.out.println(arr[n - 1]);
            }
        }
    }
}