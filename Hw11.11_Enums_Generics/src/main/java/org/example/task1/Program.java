package org.example.task1;

public class Program {
    public static void main(String[] args) {
        Pair examplePair = new Pair(25, "hello");
        System.out.println(examplePair);

        examplePair.setFirstElement(30);
        examplePair.setSecondElement("hi");
        System.out.println(examplePair);

        examplePair.swap();
        System.out.println(examplePair);
    }
}
