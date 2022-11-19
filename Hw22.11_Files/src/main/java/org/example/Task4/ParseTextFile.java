package org.example.Task4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ParseTextFile {

    public static void countLettersInFile(char letter, String fileName) {
        int counterLetter = 0;
        try {
            FileReader fr = new FileReader(fileName);
            Scanner scan = new Scanner(fr);
            String line;

            while (scan.hasNextLine()) {
                line = scan.nextLine();
                System.out.println("line: " + line);

                for (int i = 0; i < line.length(); i++) {
                    if(line.charAt(i) == letter) {
                        counterLetter++;
                    }
                }
            }

            System.out.println("counter: " + counterLetter);

            fr.close();

            FileWriter fw = new FileWriter(fileName);
            fw.write(Integer.toString(counterLetter));

            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
