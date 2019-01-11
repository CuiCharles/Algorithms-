package com.charles.algorithm.collections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * LIFO
 * @param <Item>
 */
public class Stack<Item> implements Iterable<Item> {


    public Stack(){
        //todo
    }

    public void push(Item item){
        //todo
    }

    public Item pop(){
        //todo
        return null;
    }

    public int size(){
        //todo
        return 0;
    }

    public boolean isEmpty(){
        //todo
        return false;
    }



    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Item> action) {

    }

    @Override
    public Spliterator<Item> spliterator() {
        return null;
    }
}
