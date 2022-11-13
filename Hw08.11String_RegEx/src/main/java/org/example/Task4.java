package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Set<String> differentWords = new HashSet<>();
        String singleWord;
        String text = "Listen to the news from today, and read the text at the same time. Listen to the news from today without reading the text.";

        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            singleWord = text.substring(matcher.start(), matcher.end());
            differentWords.add(singleWord);
        }

        System.out.println("Number of different words: " + differentWords.size());
    }
}
