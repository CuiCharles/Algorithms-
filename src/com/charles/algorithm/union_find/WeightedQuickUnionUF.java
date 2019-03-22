package com.charles.algorithm.union_find;

import com.charles.algorithm.book_utils.StdIn;
import com.charles.algorithm.book_utils.StdOut;

public class WeightedQuickUnionUF {

    private int[] parent;
    //维护每个组别中结点的数量
    private int [] sizes;
    private int count;


    public WeightedQuickUnionUF(int n) {
        this.count = n;
        parent = new int[n];
        sizes = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < n; i++) {
            sizes[i] = 1;
        }
    }



    public int count() {
        return count;
    }


    public int find(int p) {
        validate(p);

        int i = p;
        while(parent[i] != i){
            i = parent[i];
        }

        return i;
    }


    private void validate(int p) {
        int n = parent.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n - 1));
        }
    }

    public boolean connected(int p , int q){
        validate(p);
        validate(q);
        return find(p) == find(q);
    }

    public void union(int p , int q){
        validate(p);
        validate(q);

        int rootP = find(p);
        int rootQ = find(q);

        if(rootP == rootQ)  return ;

        if(sizes[rootP] > sizes[rootQ]){
            //让Q称为P的子树
            parent[rootQ] = rootP;
            //改变每组结点的数量
            sizes[rootP] += sizes[rootQ];
        }else{
            //让P称为Q的子树
            parent[rootP] = rootQ;
            //改变每组结点的数量
            sizes[rootQ] += sizes[rootP];
        }

        count -- ;
    }



    public static void main(String[] args){

        long startTime = System.currentTimeMillis();

        int n = StdIn.readInt();
        WeightedQuickUnionUF uf = new WeightedQuickUnionUF(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");

        long endTime = System.currentTimeMillis();

        StdOut.println("WeightedQuickUnionUF time costs:" + (endTime - startTime));
    }

}
