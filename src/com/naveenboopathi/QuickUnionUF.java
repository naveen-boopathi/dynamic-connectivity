package com.naveenboopathi;

import java.util.Arrays;

public class QuickUnionUF {
    private int[] id;

    public QuickUnionUF(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            // n array access
            id[i] = i;
        }
        System.out.println("Quick Union: " + Arrays.toString(id));
    }

    private int root(int i) {
        // chase parent pointers until reach root
        while(i != id[i]) {
            i = id[i];
        }
        return i;
    }

    public boolean connected(int p, int q) {
        // check if p and q have the same root
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        // change the root of p to point to root of q
        int i = root(p);
        int j = root(q);
        id[i] = j;
        System.out.println(Arrays.toString(id));
    }
}
