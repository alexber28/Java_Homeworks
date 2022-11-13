package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        String text, answer = "", longestWord = "", shortestWord = "";
        int indexStart = 0, indexEnd = 0, numberOfPunctuationMarks = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");  //  ""  Elvis233, 5Taylor . Alison 45  !! Mike  6  Lora32455 awec? aeca Mike :23
        text = sc.nextLine();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String str = text.substring(matcher.start(), matcher.end());
            if(str.length() > answer.length()) {
                answer = str;
            }
        }
        System.out.println("Longest numbers streak: " + answer);

        pattern = Pattern.compile("[A-Z][a-z]+");
        matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = text.substring(matcher.start(), matcher.end());
            if(shortestWord.equals("")){ //костыль
                shortestWord = word;
            }
            if(word.length() > longestWord.length()) {
                longestWord = word;
            }
            if(word.length() <= shortestWord.length()) {
                indexStart = matcher.start();
                indexEnd = matcher.end();
                shortestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord + "\tShortest word: " + shortestWord);

        if(indexStart > 0 && indexEnd > 0) {
            text = text.substring(0, indexStart) + longestWord + text.substring(indexEnd);
        }
        text = text.replaceFirst(longestWord, shortestWord);

        System.out.println("Result text: " + text);

        pattern = Pattern.compile("[\\.\",!?:]");
        matcher = pattern.matcher(text);

        while (matcher.find()) {
            numberOfPunctuationMarks++;
        }

        System.out.println("Number of punctuation marks: " + numberOfPunctuationMarks);
    }
}
