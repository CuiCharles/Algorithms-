package com.charles.algorithm.collections;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<Item> implements Iterable<Item> {

    public Bag(){
        //todo

    }

    public void add(Item item){
        //todo
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
