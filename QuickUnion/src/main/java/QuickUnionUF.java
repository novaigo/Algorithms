public class QuickUnionUF {

    private int[] id;
    public QuickUnionUF(int N) {

        //create an array and set each element to be its own root
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

        //finding a root of parents
        private int root(int i){
            while (i != id[i]) {
                i = id[i];
            }
            return i;
        }
        //check if p and q have the same root
        public boolean connected(int p, int q) {
            return root(p) == root(q);
        }

        //change root of p to point to root of q
        public void union(int p, int q){

        int i = root(p);
        int j = root(q);
        id[i] = j;

    }
}
