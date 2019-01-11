package com.charles.algorithm.collections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * FIFO
 * @param <Item>
 */
public class Queue<Item> implements Iterable<Item> {


    public Queue(){
        //todo
    }

    public void enqueue(Item item){
        //todo
    }

    public Item dequeue(){
        //todo
        return null;
    }

    public boolean isEmpty(){
        //todo
        return false;
    }

    public int size(){
        //todo
        return 0;
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
