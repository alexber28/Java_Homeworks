package org.example.men;

public class Student extends Man {
    private int yearOfEducation;

    public Student(String name, int age, String sex, int weight, int yearOfEducation) {
        super(name, age, sex, weight);
        this.yearOfEducation = yearOfEducation;
    }

    public int getYearOfEducation() {
        return yearOfEducation;
    }

    public void setYearOfEducation(int yearOfEducation) {
        this.yearOfEducation = yearOfEducation;
    }

    public void nextCourse() {
        yearOfEducation++;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                ", yearOfEducation=" + yearOfEducation +
                '}';
    }
}
