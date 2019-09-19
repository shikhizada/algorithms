package com.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class BreadthFirstSearch {

    private int V;
    private LinkedList<Integer> adj[];

    public BreadthFirstSearch(int v) {
        V = v;
        adj = new LinkedList[v + 1];
        for (int i = 0; i <= v; i++)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    int BFS(int s, int f) {
        boolean visited[] = new boolean[V + 1];
        int dist[] = new int[V + 1];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        visited[s] = true;
        queue.add(s);
        while (queue.size() != 0) {
            s = queue.poll();
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    dist[n] = dist[s] + 1;
                    queue.add(n);
                }
            }
        }
        return dist[f];
    }

    public static void main(String[] args) {
        int n, s, f;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        s = in.nextInt();
        f = in.nextInt();
        BreadthFirstSearch g = new BreadthFirstSearch(n);
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                if (in.nextInt() == 1)
                    g.addEdge(i, j);
        System.out.println(g.BFS(s, f));
    }
}