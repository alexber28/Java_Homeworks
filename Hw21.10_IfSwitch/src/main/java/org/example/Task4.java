package org.example;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        System.out.print("Medium value: ");
        if((a > b && a < c) || (a < b && a > c)){
            System.out.println(a);
        } else if ((b > a && b < c) || (b < a && b > c)){
            System.out.println(b);
        } else {
            System.out.println(c);
        }

    }
}
