package com.sort;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        in.close();
        int ind, temp = 0;
        for (int i = 1; i < n; i++) {
            ind = i;
            while (ind > 0 && arr[ind - 1] > arr[ind]) {
                temp = arr[ind - 1];
                arr[ind - 1] = arr[ind];
                arr[ind] = temp;
                ind--;
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}