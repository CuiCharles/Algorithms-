package com.charles.algorithm;

import com.charles.algorithm.book_utils.In;
import com.charles.algorithm.book_utils.StdIn;
import com.charles.algorithm.book_utils.StdOut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    List<String> list = new ArrayList<String>();


    public static int rank(int key, int[] a){
        // Array must be sorted
        int lo = 0;
        int hi = a.length -1;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(key < a[mid])
                hi = mid - 1;
            else if(key > a[mid])
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }


    public static void main(String[] args){

        int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist);
        while(! StdIn.isEmpty()){
            int key = StdIn.readInt();
            if( rank(key,whitelist) < 0){
                StdOut.println(key);
            }
        }
    }

}
