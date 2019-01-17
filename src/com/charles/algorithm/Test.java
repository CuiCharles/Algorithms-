package com.charles.algorithm;

import com.charles.algorithm.book_utils.StdOut;

import java.util.ArrayList;

public class Test extends Object{

    public static void modify(String s){
        s += "dd";
        System.out.println(s);
    }



    public static void main(String[] args){

        char[] s = {'a','b','c'};
        String a = new String(s);
        System.out.println(a);
        s[1] = 's';
        System.out.println(a);

    }
}
