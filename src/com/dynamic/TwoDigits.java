package com.dynamic;

import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] a = new int[n + 2];
        a[0] = 0;
        a[1] = 2;
        for (int i = 2; i <= n + 1; i++)
            a[i] = a[i - 1] + a[i - 2];
        System.out.println(a[n + 1]);
    }
}

//How many n-digit numbers can be created using only digits 5 and 9, where no three identical digits stand side by side?