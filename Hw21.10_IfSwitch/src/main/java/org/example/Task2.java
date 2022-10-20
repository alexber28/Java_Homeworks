package org.example;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int day, month, year;

        Scanner sc = new Scanner(System.in);
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        day++;
        switch (month){
            case 1, 3, 5, 7, 8, 10, 12 -> {
                if(day == 32){
                    day = 1;
                    month++;
                }
            }
            case 2 -> {
                boolean leapYear = (year % 4 == 0);
                if(year % 100 == 0 && !(year % 400 == 0)){
                    leapYear = false;
                }
                if(day == 29 && !leapYear){
                    day = 1;
                    month++;
                }
            }
            case 4, 6, 9, 11 -> {
                if(day == 31){
                    day = 1;
                    month++;
                }
            }
        }
        if(month == 13){
            month = 1;
            year++;
        }
        System.out.println(day + " " + month + " " + year);
    }
}
