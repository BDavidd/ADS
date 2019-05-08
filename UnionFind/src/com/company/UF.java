package com.company;

import java.util.stream.IntStream;

class UF {
    private int[] id;

    UF(int N) {
        id = new int[N];
        IntStream.range(0, N).forEach(i -> id[i] = i);
    }

    void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    boolean connected(int p, int q) {
        return id[p] == id[q];
    }
}
