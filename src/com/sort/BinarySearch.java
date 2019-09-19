package com.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int[] arr, int x) {
        int l = arr.length - 1;
        int first = 0, last = l, mid, ans = 0;
        while (first <= last) {
            mid = (first + last) / 2;
            if (arr[mid] > x)
                last = mid;
            else if (arr[mid] < x)
                first = mid;
            else {
                ans = mid;
                break;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        int x, n;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        in.close();
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        System.out.println("Index of searched number: " + binarySearch(a, x));
    }
}