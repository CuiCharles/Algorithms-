package com.charles.algorithm.union_find;

import com.charles.algorithm.book_utils.StdIn;
import com.charles.algorithm.book_utils.StdOut;

public class QuickFindUF {

    private int[] id;
    private int count;


    public QuickFindUF(int n) {
        this.count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }


    /**
     * 返回一共有多少组connected componet
     *
     * @return
     */
    public int count() {
        return count;
    }


    public int find(int p) {
        validate(p);
        return id[p];
    }


    private void validate(int p) {
        int n = id.length;
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

        int pID = id[p];
        int qID = id[q];

        if(pID == qID)  return ;

        for(int i = 0; i < id.length; i++){
            if(id[i] == pID)  id[i] = qID;
        }

        count -- ;
    }



    public static void main(String[] args){

        long startTime = System.currentTimeMillis();

        int n = StdIn.readInt();
        QuickFindUF uf = new QuickFindUF(n);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");

        long endTime = System.currentTimeMillis();

        StdOut.println("QuickFindUF time costs:" + (endTime - startTime));
    }




}
