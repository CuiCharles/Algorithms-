package com.charles.algorithm.collections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] a = (Item[])new Object[1];
    private int N;

    public ResizingArrayStack(){

    }

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    private void resize(int max){
        Item[] temp = (Item[])new Object[max];
        //copy from origin array
        for(int i = 0; i < N; i++){
            temp[i] = a[i];
        }

        a = temp;
    }


    private void push(Item item){
        if(N == a.length){
            resize(2 * a.length);
        }

        a[N++] = item;
    }

    private Item pop(){
        Item item = a[--N];
        //avoid orphan object
        a[N] = null;
        //如果stack中的元素只有数组的四分之一了，则缩减数组
        if(N > 0 && N == a.length / 4){
            resize(a.length / 2);
        }
        return item;
    }


    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }


    private class ReverseArrayIterator implements Iterator<Item>{


        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }

        @Override
        public void forEachRemaining(Consumer<? super Item> action) {

        }
    }


    public static void main(String[] args){
        ResizingArrayStack<Integer> stack = new ResizingArrayStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        for(Integer i : stack){
            System.out.println(i);
        }



    }

}
