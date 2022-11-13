package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String text = "a.pe-t_rov88@gmail.com.au алекс!?@mail.ru coder4575@yandex.ru myemail@gmail.com";
        Pattern pattern = Pattern.compile("[A-Z,a-z,0-9,\\.,_,\\-]+@[A-Z,a-z,_,\\-]+\\.[A-Z,a-z,\\.]{2,6}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}
