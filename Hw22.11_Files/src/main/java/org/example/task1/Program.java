package org.example.task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static ArrayList<Integer> firstFileNumbers = new ArrayList<>();
    public static ArrayList<Integer> secondFileNumbers = new ArrayList<>();

    public static void startWork() {
        generateNumbers();
        loadNumbersFromFiles();

//        int i = 0;
//        for (Integer num:
//             firstFileNumbers) {
//            System.out.println(i + ": " + num);
//            i++;
//        }

        Collections.sort(firstFileNumbers);
        Collections.sort(secondFileNumbers);

        generateOutputFile();

//        int i = 0;
//        for (Integer num:
//             firstFileNumbers) {
//            System.out.println(i + ": " + num);
//            i++;
//        }
    }

    private static void generateNumbers() {
        Random random = new Random();
        try {
            FileWriter fr = new FileWriter("in1.txt");
            FileWriter fw = new FileWriter("in2.txt");

            int i = 0;
            while (i < 1000) {
                fr.write(random.nextInt(100000) + "\n");
                fw.write(random.nextInt(100000) + "\n");
                i++;
            }

            fr.close();
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void loadNumbersFromFiles() {
        try {
            FileReader fr = new FileReader("in1.txt");
            FileReader fe = new FileReader("in2.txt");
            Scanner scan = new Scanner(fr);
            Scanner scan2 = new Scanner(fe);
            int number;

            while (scan.hasNextLine() && scan2.hasNextLine()) {
                number = Integer.parseInt(scan.nextLine());
                firstFileNumbers.add(number);

                number = Integer.parseInt(scan2.nextLine());
                secondFileNumbers.add(number);
            }

            fr.close();
            fe.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void generateOutputFile() {
        try {
            FileWriter fr = new FileWriter("out.txt");

            int i = 0, j = 0;
            while (i != secondFileNumbers.size() && j != firstFileNumbers.size()) {
                System.out.println(i + " " + j);
                if (firstFileNumbers.get(i) > secondFileNumbers.get(j)) {
                    fr.write((i + j + 1) + ": " + secondFileNumbers.get(j) + "\n");
                    j++;
                } else {
                    fr.write((i + j + 1) + ": " + firstFileNumbers.get(i) + "\n");
                    i++;
                }
            }

            fr.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
