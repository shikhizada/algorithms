package com.sort;

import java.util.Scanner;

public class QuickSort {

    public static int partition(int[] arr, int start, int end) {
        int temp, index = start, pivot = arr[end];
        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }
        temp = arr[end];
        arr[end] = arr[index];
        arr[index] = temp;
        return index;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) return;
        int index = partition(arr, start, end);
        quickSort(arr, start, index - 1);
        quickSort(arr, index + 1, end);

    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        in.close();
        quickSort(arr, 0, n - 1);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}