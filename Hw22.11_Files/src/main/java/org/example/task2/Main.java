package org.example.task2;

public class Main {
    public static void main(String[] args) {
        String text = ContentCounter.loadTextFromFile("textTask2.txt");
        System.out.println("words in text: " + ContentCounter.countWords(text));
        System.out.println("punctuation marks in text: " + ContentCounter.countPunctuationMarks(text));
    }
}
