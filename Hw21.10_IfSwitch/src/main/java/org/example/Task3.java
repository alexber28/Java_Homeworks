package org.example;

public class Task3 {
    public static void main(String[] args) {
        int seconds = (int) (Math.random() * 28800);
        System.out.println(seconds);

        int fullHours = (int) seconds / 3600;
        switch (fullHours){
            case 1 -> System.out.println("Остался 1 час");
            case 2, 3, 4 -> System.out.println("Осталось " + fullHours + " часа");
            case 5, 6, 7, 8 -> System.out.println("Осталось " + fullHours + " часов");
        }
    }
}
