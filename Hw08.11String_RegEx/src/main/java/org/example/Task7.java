package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        String text = "127.0.0.1 246.0.0.1 255.255.255.253 777.777.77.77 10.99.44 0.0.0.0", singleWord;
        Pattern pattern = Pattern.compile("(([2]{1}[5]{1}[0-5]{1})|([2]{1}[0-4]{1}[0-9]{1})|([1]{1}[0-9]{2})|([0-9]{1,2}))\\.(([2]{1}[5]{1}[0-5]{1})|([2]{1}[0-4]{1}[0-9]{1})|([1]{1}[0-9]{2})|([0-9]{1,2}))\\.(([2]{1}[5]{1}[0-5]{1})|([2]{1}[0-4]{1}[0-9]{1})|([1]{1}[0-9]{2})|([0-9]{1,2}))\\.(([2]{1}[5]{1}[0-5]{1})|([2]{1}[0-4]{1}[0-9]{1})|([1]{1}[0-9]{2})|([0-9]{1,2}))");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
