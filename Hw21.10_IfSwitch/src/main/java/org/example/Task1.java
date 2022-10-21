package org.example;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        int allSeconds, hours = 0, minutes = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        allSeconds = sc.nextInt();

        if(allSeconds / 3600 > 0){
            hours = allSeconds / 3600;
            allSeconds -= hours * 3600;

            System.out.print(hours + " ");
            if(hours != 11) {
                int tempHours = hours % 10;
                switch (tempHours){
                    case 1 -> System.out.print("час ");
                    case 2, 3, 4 -> System.out.print("часа ");
                    default -> System.out.print("часов ");
                }
            } else {
                System.out.print("часов ");
            }
        }

        if(allSeconds / 60 > 0){
            minutes = allSeconds / 60;
            allSeconds -= minutes * 60;

            System.out.print(minutes + " ");
            if(minutes != 11 && minutes != 12 && minutes != 13 && minutes != 14) {
                int tempMinutes = minutes % 10;
                switch (tempMinutes){
                    case 1 -> System.out.print("минута ");
                    case 2, 3, 4 -> System.out.print("минуты ");
                    default -> System.out.print("минут ");
                }
            } else {
                System.out.print("минут ");
            }
        }

        if(allSeconds > 0){
            System.out.print(allSeconds + " ");

            if(allSeconds != 11 && allSeconds != 12 && allSeconds != 13 && allSeconds != 14) {
                int tempSeconds = allSeconds % 10;
                switch (tempSeconds){
                    case 1 -> System.out.print("секунда ");
                    case 2, 3, 4 -> System.out.print("секунды ");
                    default -> System.out.print("секунд ");
                }
            } else {
                System.out.print("секунд ");
            }
        }

        int weeks = 0, days = 0;
        if(hours / 168 > 0){
            weeks = hours / 168;
            hours -= weeks * 168;
        }
        if(hours / 24 > 0){
            days = hours / 24;
            hours -= days * 24;
        }
        System.out.println("\n" + weeks + " нед. " + days + " дн. " + hours + " ч. " + minutes + " мин. " +allSeconds + " сек.");

    }
}
