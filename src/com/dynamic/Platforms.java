package com.dynamic;

import java.util.Scanner;

public class Platforms {
    public static void main(String[] args) {
        int n, one, two;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        int[] path = new int[n];
        int[] ans = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        dp[0] = 0;
        path[0] = -1;
        dp[1] = Math.abs(arr[1] - arr[0]);
        path[1] = 0;
        for (int i = 2; i < dp.length; i++) {
            one = dp[i - 1] + Math.abs(arr[i] - arr[i - 1]);
            two = dp[i - 2] + 3 * Math.abs(arr[i] - arr[i - 2]);
            dp[i] = Math.min(one, two);
            if (one < two) {
                dp[i] = one;
                path[i] = i - 1;
            } else {
                dp[i] = two;
                path[i] = i - 2;
            }
        }

        int j, k;
        j = n - 1;
        k = 0;
        ans[k] = n;
        k++;
        while (j > 0) {
            if (path[j] == j - 1) {
                ans[k] = j;
                k++;
                j--;
            } else {
                ans[k] = j - 1;
                k++;
                j -= 2;
            }
        }

        System.out.println(dp[n - 1]);
        System.out.println(k);
        for (int i = k - 1; i > 0; i--) {
            System.out.print(ans[i] + " ");
        }
        System.out.println(ans[0]);
    }
}