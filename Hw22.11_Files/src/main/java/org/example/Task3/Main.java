package org.example.Task3;

public class Main {
    public static final String fileName = "binary_numbers.dat";

    public static void main(String[] args) {
        BinaryFile.generateBinaryFile(fileName);
        System.out.println("arithmetic mean of numbers: " + BinaryFile.sumBinaryNumbers(fileName));
    }
}
