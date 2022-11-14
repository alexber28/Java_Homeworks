package org.example.task2;

import java.util.Iterator;

public class ArrayIterator implements Iterator<Integer> {
    private Integer[][] m;
    private int i, j;
    public ArrayIterator(Integer[][] m) {
        this.m = m;
    }
    @Override
    public boolean hasNext() {
        return i < m.length && j < m[i].length;
    }
    @Override
    public Integer next() {
        Integer r = m[i][j++];
        if (j >= m[i].length) {
            i++;
            j = 0;
        }
        return r;
    }
}
