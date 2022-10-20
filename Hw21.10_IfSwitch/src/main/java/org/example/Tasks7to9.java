package org.example;

public class Tasks7to9 {
    public static void main(String[] args) {
        int number = 3;

        //Task7________
//        if(number % 2 == 0){
//            System.out.println("Число четное");
//        } else {
//            System.out.println("Число нечетное");
//        }

        //Task8________
//        switch (number){
//            case 1 -> System.out.println("Большой палец");
//            case 2 -> System.out.println("Указательный палец");
//            case 3 -> System.out.println("Средний палец");
//            case 4 -> System.out.println("Безымянный палец");
//            case 5 -> System.out.println("Мезинец");
//            default -> System.out.println("Такого пальца на руке нет, но бывают и исключения ;)");
//        }

        //Task9________
        switch (number){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesay");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Are you sure this day really exists?");
        }
    }
}
