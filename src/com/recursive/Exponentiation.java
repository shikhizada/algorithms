package com.recursive;

import java.util.Scanner;

public class Exponentiation {

    public static long func(long a, long b, long c) {
        long temp;
        if (b == 0)
            return 1;
        temp = func(a, b / 2, c) % c;
        if (b % 2 == 0)
            return temp * temp % c;
        else
            return (a % c) * (temp * temp % c);
    }

    public static void main(String[] args) {
        long a, b, c;
        Scanner in = new Scanner(System.in);
        a = in.nextLong();
        b = in.nextLong();
        c = in.nextLong();
        System.out.println(func(a, b, c) % c);
    }
}