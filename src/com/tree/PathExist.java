package com.tree;

import java.util.Scanner;

public class PathExist {
    public static void main(String[] args) {
        int pn, cn, min, max, k = 0;
        min = -2147483648;
        max = 2147483647;
        Scanner in = new Scanner(System.in);
        pn = in.nextInt();
        while (in.hasNext()) {
            cn = in.nextInt();
            if (cn < min || cn > max) {
                k = 1;
                break;
            }
            if (cn > pn)
                min = pn;
            else
                max = pn;
            pn = cn;
        }
        if (k == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}