package com.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Tree {

    int k = 0;
    LinkedList<Integer> adj[];
    boolean[] visited;

    public Tree(int v) {
        adj = new LinkedList[v + 1];
        visited = new boolean[v + 1];
        for (int i = 1; i < v + 1; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    int DFS(int s) {
        visited[s] = true;
        Iterator<Integer> i = adj[s].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                k++;
                DFS(n);
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int n, x, z = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Tree g = new Tree(n);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                x = in.nextInt();
                if (x == 1) {
                    g.addEdge(i, j);
                    z++;
                }
            }
        }
        if (z == 2 * g.DFS(1) && z == 2 * n - 2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}