package org.example;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int x0, y0, radius; //parameteres of circle

        Scanner sc = new Scanner(System.in);
        x0 = sc.nextInt();
        y0 = sc.nextInt();
        radius = sc.nextInt();

        int x, y;
        System.out.println("Enter x, y of a point:");
        x = sc.nextInt();
        y = sc.nextInt();

        if(Math.pow(x - x0, 2) + Math.pow(y - y0, 2) <= radius * radius){
            System.out.println("Point belongs to the circle");
        } else {
            System.out.println("Point doesn't belong to the circle");
        }
    }
}
