package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class PostfixRecord {
    public static void main(String[] args) {
        int s;
        String t;
        Scanner in = new Scanner(System.in);
        t = in.nextLine();
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < t.length(); i++) {
            if (Character.isDigit(t.charAt(i)))
                st.push((int) t.charAt(i) - 48);
            else if (t.charAt(i) == '+') {
                s = st.pop();
                s += st.pop();
                st.push(s);
            } else if (t.charAt(i) == '-') {
                s = -st.pop();
                s += st.pop();
                st.push(s);
            } else if (t.charAt(i) == '*') {
                s = st.pop();
                s *= st.pop();
                st.push(s);
            }
        }
        System.out.println(st.peek());
    }
}