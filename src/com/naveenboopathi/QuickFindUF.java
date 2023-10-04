package com.naveenboopathi;

import java.util.Arrays;

public class QuickFindUF {
    // eager approach
    private int[] id;

    public QuickFindUF(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            // set id for each object to itself
            // n array access
            id[i] = i;
        }
        System.out.println("Quick Find: " + Arrays.toString(id));
    }

    public boolean connected(int p, int q) {
        // check whether p and q are in same component
        // 2 array access
        return id[p] == id[q];
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if(id[i] == pid) {
                // change all entries with pid to qid
                id[i] = qid;
            }
        }
        System.out.println(Arrays.toString(id));
    }
}
