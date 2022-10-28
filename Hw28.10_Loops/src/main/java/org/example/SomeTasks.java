package org.example;

import java.util.*;

public class SomeTasks {
    public static void main(String[] args) {
        //For tasks 1-9
        Random random = new Random();
        int[] testArray = new int[10];

        for (int i = 0; i < testArray.length; i++) {
            testArray[i] = random.nextInt(100) - 49;
        }
        System.out.println("Array:\n" + Arrays.toString(testArray));

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

//        //Task10
//        int[][] matrix = new int[5][5];
//
//        Random random = new Random();
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = random.nextInt(20) - 9;
//            }
//        }
//        System.out.println("Matrix: \n" + Arrays.deepToString(matrix));
//
//        int maxSum = matrix[0][0] + matrix[0][1] + matrix[0][2] + matrix[0][3] + matrix[0][4];
//
//        for (int i = 1; i < matrix.length; i++) {
//            int sum = 0;
//
//            for (int j = 0; j < matrix[i].length; j++) {
//                sum += matrix[i][j];
//            }
//
//            if (sum > maxSum) {
//                maxSum = sum;
//            }
//        }
//        System.out.println("Maximal sum of lines is: " + maxSum);

        //Task11
//        int[][] matrix = new int[4][4];
//        Random random = new Random();
//
//        System.out.println("Matrix:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = random.nextInt(20) - 9;
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = i + 1; j < matrix[i].length; j++) {
//                int temp = matrix[i][j];
//                matrix[i][j] = matrix[j][i];
//                matrix[j][i] = temp;
//            }
//        }
//
//        System.out.println("\nTransposed matrix:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }

        //Task12
//        int[][] matrix = new int[4][4];
//        int temp;
//        boolean condition = false;
//        Random random = new Random();
//
//        System.out.println("Matrix:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                matrix[i][j] = random.nextInt(20) - 9;
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix.length % 2 == 1 && i == matrix.length / 2 && j == matrix[i].length / 2) {
//                    condition = true;
//                    break;
//                }
//                if (matrix.length % 2 == 0 && i == matrix.length / 2) {
//                    condition = true;
//                    break;
//                }
//                temp = matrix[i][j];
//                matrix[i][j] = matrix[matrix.length - i - 1][matrix[i].length - j - 1];
//                matrix[matrix.length - i - 1][matrix[i].length - j - 1] = temp;
//            }
//            if (condition) {
//                break;
//            }
//        }
//
//        System.out.println("\nConverted matrix:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }

        //Task13
//        int length, summary = 0, numberOfElements = 0, sumForElements = 0;
//        double arithmeticMean;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of matrix: ");
//        length = sc.nextInt();
//
//        int[][] matrix = new int[length][length];
//        Random random = new Random();
//
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                if (i == j || i + j == length - 1) {
//                    matrix[i][j] = 0;
//                }
//                if ((j > i && i + j < length - 1) || (i > j && i + j >= length)) {
//                    matrix[i][j] = random.nextInt(10);
//                }
//                if ((j > i && i + j >= length) || (i > j && i + j < length - 1)) {
//                    matrix[i][j] = random.nextInt(10) - 10;
//                }
//            }
//        }
//
//        System.out.println("Matrix:");
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                System.out.print(matrix[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                summary += matrix[i][j];
//            }
//        }
//        System.out.println("Summary of all elements: " + summary);
//
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                if (matrix[i][j] > summary) {
//                    sumForElements += matrix[i][j];
//                    numberOfElements++;
//                }
//            }
//        }
//        arithmeticMean = (double) sumForElements / numberOfElements;
//        System.out.println("Arithmetic mean: " + arithmeticMean);
//
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
