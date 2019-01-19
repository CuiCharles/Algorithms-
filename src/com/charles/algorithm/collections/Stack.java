package com.charles.algorithm.collections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * LIFO
 * @param <Item>
 */
public class Stack<Item> /*implements Iterable<Item> */{

    private Node first;
    private int N;


    public Stack(){

    }

    public void push(Item item){
        Node oldFirstNode = first;
        first = new Node();
        first.item = item;
        first.next = oldFirstNode;
        N++;
    }

    public Item pop(){
        if(isEmpty()){
            return null;
        }
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    public int size(){

        return N;
    }

    public boolean isEmpty(){
        return N == 0;
    }


//
//    @Override
//    public Iterator<Item> iterator() {
//        return null;
//    }
//
//    @Override
//    public void forEach(Consumer<? super Item> action) {
//
//    }
//
//    @Override
//    public Spliterator<Item> spliterator() {
//        return null;
//    }


    private class Node{
        Item item;
        Node next;
    }

    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        System.out.println("Stack是否为空："+stack.isEmpty());
        stack.push("cui");
        stack.push("wen");
        stack.push("ju");
        System.out.println("Stack的数量是："+stack.size());
        System.out.println("Stack出栈结果：" + stack.pop());
        System.out.println("Stack的数量是："+stack.size());
    }
}


