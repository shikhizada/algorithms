package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    public static void main(String[] args) {
        int n, k = 0;
        String t;
        char x;
        Stack<Character> st = new Stack<>();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        in.nextLine();
        t = in.nextLine();
        st.push('0');
        for (int j = 0; j < t.length(); j++) {
            x = t.charAt(j);
            if (x == '{' || x == '(' || x == '[')
                st.push(x);
            else if (st.peek() == '{' && x == '}')
                st.pop();
            else if (st.peek() == '(' && x == ')')
                st.pop();
            else if (st.peek() == '[' && x == ']')
                st.pop();
            else {
                k = 1;
                break;
            }
        }
        if (st.size() == 1 && k == 0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}