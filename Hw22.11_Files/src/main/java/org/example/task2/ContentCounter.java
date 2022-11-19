package org.example.task2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ContentCounter {
    public static final ArrayList<Character> punctuationMarks = new ArrayList<>(Arrays.asList('.', ',', '-', '\'', '\"', '?', '!'));

    public static String loadTextFromFile(String fileName) {
        String text = "";
        try {
            FileReader fr = new FileReader(fileName);
            Scanner scan = new Scanner(fr);
            int number;

            while (scan.hasNextLine()) {
                text += scan.nextLine();
            }

            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return text;
    }

    public static int countWords(String text) {
        int counterWords = 0;
        boolean isWord = true;
        char letter;

        for (int i = 0; i < text.length(); i++) {
            letter = text.charAt(i);
            if((letter >= 'A' && letter <= 'Z') || ((letter >= 'a' && letter <= 'z')) && isWord) {
                isWord = false;
                counterWords++;
            }

            if(punctuationMarks.contains(letter) || letter == ' ') {
                isWord = true;
            }
        }

        return counterWords;
    }

    public static int countPunctuationMarks(String text) {
        int marksCounter = 0;

        for (int i = 0; i < text.length(); i++) {
            if(punctuationMarks.contains(text.charAt(i))) {
                marksCounter++;
            }
        }

        return marksCounter;
    }
}
