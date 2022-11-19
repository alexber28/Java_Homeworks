package org.example.Task3;

import java.io.*;
import java.util.Random;

public class BinaryFile {
    public static void generateBinaryFile(String fileName) {
        Random random = new Random();
        try (DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream(fileName,false)))) {
            for (int i = 0; i < 30; i++) {
                dos.writeBytes(random.nextInt(100) + 1 + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double sumBinaryNumbers(String fileName) {
        int numbersCounter = 0;
        int summaryOfNums = 0;

        try(DataInputStream dis = new DataInputStream(
                new BufferedInputStream(new FileInputStream(fileName)))) {

            int line;
            while ((line = dis.read()) != -1) {
                System.out.println(line);

                summaryOfNums += line;
                numbersCounter++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (double) summaryOfNums / numbersCounter;
    }
}
