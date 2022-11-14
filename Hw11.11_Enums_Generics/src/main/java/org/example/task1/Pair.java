package org.example.task1;

public class Pair<T> {
    private T firstElement;
    private T secondElement;

    public Pair(T firstElement, T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public T getSecondElement() {
        return secondElement;
    }

    public void swap() {
        T buffer = this.firstElement;
        this.firstElement = this.secondElement;
        this.secondElement = buffer;
    }

    public void setFirstElement(T firstElement) {
        this.firstElement = firstElement;
    }

    public void setSecondElement(T secondElement) {
        this.secondElement = secondElement;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "firstElement=" + firstElement +
                ", secondElement=" + secondElement +
                '}';
    }
}
