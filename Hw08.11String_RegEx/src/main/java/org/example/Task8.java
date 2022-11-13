package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        String text = "https://www.it-academy.by/course/java-developer/   https://catalog.onliner.by/bike?is_prime=1";
        Pattern pattern = Pattern.compile("((https://)|(http://)){1}[A-Z,a-z,0-9,\\.,_,\\-]+/{1}[A-Z,a-z,0-9,\\.,_,\\-,/,?,=]+/?");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
