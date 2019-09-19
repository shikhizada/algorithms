package com.sort;

import java.util.Scanner;

public class MergeSort {

    public static void merge(int left[], int right[], int arr[]) {
        int l1 = left.length;
        int l2 = right.length;
        int i = 0, j = 0, k = 0;
        while (i < l1 && j < l2) {
            if (left[i] > right[j]) {
                arr[k] = right[j];
                j++;
                k++;
            } else {
                arr[k] = right[j];
                i++;
                k++;
            }
        }
        while (i < l1) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < l2) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[]) {
        int l = arr.length;
        if (l < 2) return;
        int mid = l / 2;
        int[] left = new int[mid];
        int[] right = new int[l - mid];
        for (int i = 0; i < mid; i++)
            left[i] = arr[i];
        for (int i = 0; i < l - mid; i++)
            right[i] = arr[mid + i];
        mergeSort(left);
        mergeSort(right);
        merge(left, right, arr);
    }

    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();
        in.close();
        mergeSort(arr);
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

}