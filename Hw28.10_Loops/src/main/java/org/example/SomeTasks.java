package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SomeTasks {
    public static void main(String[] args) {
//        Random random = new Random();
//        int[] testArray = new int[10];
//
//        for (int i = 0; i < testArray.length; i++) {
//            testArray[i] = random.nextInt(100) - 49;
//        }
//        System.out.println("Array:\n" + Arrays.toString(testArray));

        //Task1,2
//        int maximum = testArray[0];
//        int minimum = testArray[0];
//
//        for (int i = 1; i < testArray.length; i++) {
//            if (testArray[i] > maximum) {
//                maximum = testArray[i];
//            }
//            if(testArray[i] < minimum){
//                minimum = testArray[i];
//            }
//        }
//
//        System.out.println("Maximal element: " + maximum + "\tMinimal element: " + minimum);

        //Task3
//        int summary = 0;
//
//        for (int j : testArray) {
//            summary += sumOfDigits(j);
//        }
//
//        System.out.println("Sum of digits of numbers: " + summary);

        //Task4,5
//        int maximum = testArray[0];
//        int minimum = testArray[1];
//
//        for (int i = 2; i < testArray.length; i++) {
//            if (testArray[i] > maximum && i % 2 == 0) {
//                maximum = testArray[i];
//            }
//            if (testArray[i] < minimum && i % 2 == 1) {
//                minimum = testArray[i];
//            }
//        }
//
//        System.out.println("Maximal element: " + maximum + "\tMinimal element: " + minimum);

        //Task6
//        List<Integer> positiveElements = new ArrayList<>();
//        List<Integer> negativeElements = new ArrayList<>();
//
//        for (int j : testArray) {
//            if (j > 0) {
//                positiveElements.add(j);
//            }
//            if (j < 0) {
//                negativeElements.add(j);
//            }
//        }
//
//        System.out.println("Positive numbers: " + positiveElements + "\nNegative numbers: " + negativeElements);

        //Task7_for this task testArray doesn't use
//        List<Integer> taskArray = new ArrayList<>();
//        List<Integer> resultArray = new ArrayList<>();
//
//        for (int i = 0; i < 10; i++) {
//            taskArray.add(random.nextInt(10));
//        }
//
//        System.out.println("\nArray for this task: " + taskArray);
//
//        for (Integer number :
//                taskArray) {
//            if (!(resultArray.contains(number))) {
//                resultArray.add(number);
//            }
//        }
//
//        System.out.println("Result: " + resultArray);

        //Task8
//        int minIndex = 0, maxIndex = 0;
//
//        for (int i = 1; i < testArray.length; i++) {
//            if (testArray[i] > testArray[maxIndex]) {
//                maxIndex = i;
//            }
//            if (testArray[i] < testArray[minIndex]) {
//                minIndex = i;
//            }
//        }
//
//        System.out.println("Maximal index: " + maxIndex + "\tMinimal index: " + minIndex);

        //Task9
//        int[] firstArray = new int[]{-9, -3, -2, 0, 5, 9};
//        int[] secondArray = new int[]{-7, 0, 0, 1, 2, 4, 8};
//        List<Integer> taskArray = new ArrayList<>();
//        int counterFirst = 0, counterSecond = 0;
//
//        while (counterFirst < firstArray.length && counterSecond < secondArray.length) {
//            if (firstArray[counterFirst] < secondArray[counterSecond]) {
//                taskArray.add(firstArray[counterFirst]);
//                counterFirst++;
//            } else {
//                taskArray.add(secondArray[counterSecond]);
//                counterSecond++;
//            }
//        }
//
//        System.out.println("Result array: " + taskArray);

        //Task10
        

    }

    private static int sumOfDigits(int number) {
        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
