package com.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Connected {

    int k = 0;
    LinkedList<Integer> adj[];
    boolean[] visited;

    public Connected(int v) {
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
        return k + 1;
    }

    public static void main(String[] args) {
        int n, m, x, y;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        Connected g = new Connected(n);
        for (int i = 0; i < m; i++) {
            x = in.nextInt();
            y = in.nextInt();
            g.addEdge(x, y);
            g.addEdge(y, x);
        }
        if (g.DFS(1) == n)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}