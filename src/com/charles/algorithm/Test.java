package com.charles.algorithm;

import com.charles.algorithm.book_utils.StdOut;

public class Test extends Object{

    public static void main(String[] args){

        StdOut.printf("%5d is my lucky number.",12);
        StdOut.println();
        StdOut.printf("%-5d is my lucky number.",12);


        StdOut.println();
        StdOut.printf(String.valueOf(1.0/0.0));
    }
}
