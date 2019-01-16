package com.charles.algorithm.collections;

public class FixedCapacityStackOfStrings {

    private String[] a;
    private int N;

    public FixedCapacityStackOfStrings(int cap){

        a = new String[cap];
        N = 0;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public String pop(){
        return a[--N];
    }

    public int size(){
        return N;
    }


    public void push(String item){
        a[N++] = item;
    }





    public static void main(String[] args){

        FixedCapacityStackOfStrings s = new FixedCapacityStackOfStrings(10);
        s.push("1");
        s.push("2");
        s.push("3");

        System.out.println(s.size());

        System.out.println(s.pop());
        System.out.println(s.size());


    }
}
