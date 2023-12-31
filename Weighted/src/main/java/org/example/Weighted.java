package org.example;

public class Weighted {

    private int[] id; // parent link for each element in the link

    private int[] sz; // size of components for roots

    private int count; // number of components

    public Weighted(int N) {

        count = N;

        id = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
        sz = new int[N];
        for (int i = 0; i < N; i++) {
            sz[i] = 1;
        }
    }

    // return current count of components
    public int count() {
        return count;
    }

    // checks if q and p are connected, with find it gets to the root of each element
    public boolean connected (int p, int q) {
        return find(p) == find(q);
    }
    // finds the root of p in the weighted structure, it follows the parent link until it reaches root
    public int find(int p) {
        while (p != id[p]) {
            p = id[p];
        }

        return p;
    }
    // finds the root and then combines smaller root to the larger one making weighted structure
    public void union (int p, int q) {

        int i = find (p);
        int j = find (q);

        if (i == j) return;

        if (sz[i] < sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
        count++;
    }
}
