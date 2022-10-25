package org.example;

import java.util.Scanner;

public class Some_tasks {
    public static void main(String[] args) {
        //Task1
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " = " + (5 * i));
        }

        //Task2
//        int number = 2;
//        for (int i = 1; i < 10; i++) {
//            System.out.print(number + " ");
//            number *= 2;
//        }

        //Task3
//        int iterations = 1;
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < iterations; j++) {
//                System.out.print("*");
//            }
//            iterations++;
//            System.out.println();
//        }

        //Task4
//        int number, summary = 0, multiplication = 1, temp;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        number = sc.nextInt();
//
//        while (number > 0) {
//            temp = number % 10;
//            summary += temp;
//            multiplication *= temp;
//            number /= 10;
//        }
//
//        System.out.println("Summary: " + summary + "\tMultiplication: " + multiplication);

        //Task5
//        int number, maxNumber = 0, index = 0, temp, currentPosition = 1;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        number = sc.nextInt();
//
//        while (number > 0) {
//            temp = number % 10;
//            if (temp > maxNumber) {
//                maxNumber = temp;
//                index = currentPosition;
//            }
//            number /= 10;
//            currentPosition++;
//        }
//
//        System.out.println("Maximum number: " + maxNumber + "\tIndex: " + (currentPosition - index));

        //Task6
//        int factorial, number;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        number = sc.nextInt();
//
//        if (number >= 0) {
//            factorial = getFactorial(number);
//            System.out.println("Factorial: " + factorial);
//        } else {
//            System.out.println("There is no factorial for negative numbers");
//        }

        //Task7
//        int[] fibNumbers = new int[12];
//        fibNumbers[0] = 0;
//        fibNumbers[1] = 1;
//
//        System.out.print("Fibonacci sequence:\n" + fibNumbers[1] + "\t");
//        for (int i = 2; i < fibNumbers.length; i++) {
//            fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
//            System.out.print(fibNumbers[i] + "\t");
//        }

        //Task8 (43840)
//        int summary = 0;

//        for (int i = 1; i < 99_999; i++) {
//            summary += ifContainsNumbers(i);
//
//            //second variant
//            //String h = Integer.toString(i);
//            //if (h.contains("4") || h.contains("13")) {
//            //    summary++;
//            //}
//        }
//
//        System.out.println("Number of technique to remove: " + summary);

        //Task9 (55251)
//        int summary = 0;
//
//        for (int i = 1001; i <= 999_999; i++) {
//            summary += ifSummaryOfHalfsEqual(i);
//        }
//
//        System.out.println("Number of lucky tickets: " + summary);

        //Task10 (23756)
//        int summary = 0;
//
//        for (int i = 1; i < 50_000; i++) {
//            summary += ifNumberContainsTwo(i);
//        }
//
//        System.out.println("Number of defective plates: " + summary);

        //Task11
//        int variable;
//        boolean answer = false;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        variable = sc.nextInt();
//
//        for (int i = 2; i < Math.sqrt(variable); i++) {
//            if (variable % i == 0) {
//                answer = true;
//                break;
//            }
//        }
//        if (answer) {
//            System.out.println("Significant number");
//        } else {
//            System.out.println("Prime number");
//        }

        //Task12 (16)
//        int times = 0;
//
//        for (int hours = 0; hours < 24; hours++) {
//            for (int minutes = 0; minutes < 60; minutes++) {
//                if (hours / 10 == minutes % 10 && hours % 10 == minutes / 10) {
//                    times++;
//                }
//            }
//        }
//
//        System.out.println("Time palindromes per day: " + times);
    }

    public static int ifNumberContainsTwo(int num) {
        final int two = 2;

        while (num > 0) {
            if (num % 10 == two) {
                return 1;
            }
            num /= 10;
        }

        return 0;
    }

    public static int ifSummaryOfHalfsEqual(int number) {
        int firstHalf = number / 1000, secondHalf = number % 1000;
        if (summaryOfDigits(firstHalf) == summaryOfDigits(secondHalf)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int summaryOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int ifContainsNumbers(int number) {
        int temp;
        final int four = 4;
        final int thirteen = 13;

        while (number > 0) {
            temp = number % 10;
            if (temp == four) {
                return 1;
            }

            temp = number % 100;
            if (temp == thirteen) {
                return 1;
            }

            number /= 10;
        }

        return 0;
    }

    public static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }
}
