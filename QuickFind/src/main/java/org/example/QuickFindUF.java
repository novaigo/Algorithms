package org.example;
public class QuickFindUF {
    // integer array
    private int[] id;

    public QuickFindUF(int N) {

        //setting id of each object to itself, creating array and setting values
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    //check if the p and q are in the same component
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public void union(int p, int q) {

        int pid = id[p];
        int qid = id[q];

        //changes all entries with id[p] to id[q]

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }

        }
    }
}
