package com.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class GetTree {

    LinkedList<Integer> adj[];
    boolean[] visited;

    public GetTree(int v) {
        adj = new LinkedList[v + 1];
        visited = new boolean[v + 1];
        for (int i = 1; i < v + 1; i++)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFS(int s) {
        visited[s] = true;
        Iterator<Integer> i = adj[s].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                System.out.println(s + " " + n);
                DFS(n);
            }
        }
    }

    public static void main(String[] args) {
        int n, m, x, y;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        GetTree g = new GetTree(n);
        for (int i = 0; i < m; i++) {
            x = in.nextInt();
            y = in.nextInt();
            g.addEdge(x, y);
        }
        g.DFS(1);
    }
}