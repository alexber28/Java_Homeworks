package org.example.task2;

public class Program {
    public static void main(String[] args) {
        Integer[][] array = new Integer[][]{{1, 11}, {2,3,4,5,},{6},{8,9,10,11,12,}, {22,23,24}};
        ArrayIterator i = new ArrayIterator(array);
        for (;i.hasNext();) {
            System.out.println(i.next());
        }
    }
}
