package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String word;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        word = sc.nextLine();

        word = word.trim();
        word = word.replaceAll("\\s+", " ");

        System.out.println("Output: " + word);
    }
}
