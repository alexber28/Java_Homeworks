package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String text = "#afb123 FFFFFF #000 101011 #12 #BC123D";
        Pattern pattern = Pattern.compile("#?([A-F,a-f,0-9]{6}|[A-F,0-9]{3})");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
