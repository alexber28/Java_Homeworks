package org.example;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int a, b, c;
        System.out.println("a*x^2 + b*x + c = 0 - quadratic equaton");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        a = sc.nextInt();
        System.out.print("Enter b: ");
        b = sc.nextInt();
        System.out.print("Enter c: ");
        c = sc.nextInt();

        int discriminant = b * b - 4 * a * c;
        if(discriminant > 0){
            double x1, x2;
            x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Answers:");
            System.out.format("x1 = %.5f\tx2 = %.5f", x1, x2);
        } else if (discriminant == 0) {
            double x = (double) (-b) / (2 * a);
            System.out.println("Answer:");
            System.out.format("x = %.5f", x);
        } else {
            System.out.println("No answers");
        }

    }
}
