package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String word;

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        word = sc.nextLine();

        if(word.startsWith("abc")) {
            word = word.replaceFirst("abc", "www");
        } else {
            word = word.replace("abc", "");
            word += "zzz";
        }
        System.out.println("Output: " + word);

    }
}
