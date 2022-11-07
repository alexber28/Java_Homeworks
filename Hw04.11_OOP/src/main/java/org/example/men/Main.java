package org.example.men;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Valeria", 25, "Female", 60, 2);
        System.out.println(student);

        student.nextCourse();
        System.out.println(student);

        student.setYearOfEducation(1);
        System.out.println(student);
    }
}
