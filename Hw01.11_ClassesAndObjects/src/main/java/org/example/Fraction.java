package org.example;

import java.util.Random;

public class Fraction {
    private int numerator;
    private int denominator;
    Random random = new Random();

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this.numerator = random.nextInt(10) + 1;
        this.denominator = random.nextInt(10) + 1;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void displayFraction() {
        System.out.println("Fraction: " + this.numerator + " / " + this.denominator);
    }

    public Fraction addition(Fraction fraction) {
        int numerator = 0, denominator = 0;
        boolean flag = true;

        if (this.denominator == fraction.denominator) {
            flag = false;
            numerator = this.numerator + fraction.numerator;
            denominator = this.denominator;
        }

        if (this.denominator % fraction.denominator == 0) {
            flag = false;
            numerator = this.numerator + fraction.numerator * (this.denominator / fraction.denominator);
            denominator = this.denominator;
        }

        if (fraction.denominator % this.denominator == 0) {
            flag = false;
            numerator = this.numerator * (fraction.denominator / this.denominator) + fraction.numerator;
            denominator = fraction.denominator;
        }

        if (flag) {
            numerator = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
            denominator = this.denominator * fraction.denominator;
        }
        return reduceFraction(numerator, denominator);
    }

    public Fraction multiplying(Double number) {
        number *= this.numerator;
        number /= this.denominator;

        return doubleToFraction(number);
    }

    public Fraction division(Double number) {
        Fraction fraction = doubleToFraction(number);

        return reduceFraction(this.numerator * fraction.denominator, this.denominator * fraction.numerator);
    }

    public Fraction doubleToFraction(Double number) {
        int numerator, denominator;

        String stringNumber = number.toString();

        if (stringNumber.length() > 5) {
            stringNumber = stringNumber.substring(0, 5);
        }

        numerator = Integer.parseInt(stringNumber.substring(0, stringNumber.indexOf(".")) + stringNumber.substring(stringNumber.indexOf(".") + 1));
        denominator = (int) Math.pow(10, stringNumber.substring(stringNumber.indexOf(".")).length() - 1);

        return reduceFraction(numerator, denominator);
    }

    public Fraction reduceFraction(int numerator, int denominator) {
        int counter = Math.min(numerator, denominator);
        for (int i = 2; i < counter; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                numerator /= i;
                denominator /= i;
                i--;
            }
        }

        return new Fraction(numerator, denominator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
