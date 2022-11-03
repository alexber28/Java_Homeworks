package org.example;

public class Main {
    public static void main(String[] args) {
        //Task1
        Fraction fractionOne = new Fraction(3, 5);
        fractionOne.displayFraction();

        Fraction resultFraction;

        resultFraction = fractionOne.addition(new Fraction(4, 9));
        resultFraction.displayFraction();

        resultFraction = fractionOne.multiplying(0.50000005);
        resultFraction.displayFraction();

        resultFraction = fractionOne.division(1.5);
        resultFraction.displayFraction();

        //Task2
//        Phone phoneOne = new Phone("Alex", "+375 25 111-11-11", "iPhone", 340);
//        Phone phoneTwo = new Phone("Roman", "+375 29 222-22-22", "Huawei", 390);
//        Phone phoneThree = new Phone("Alina", "+375 44 333-33-33", "Xiaomi", 420);
//
//        System.out.println(phoneOne + "\n" + phoneTwo + "\n" + phoneThree);
//
//        phoneOne.receiveCall("Artem");
//        phoneTwo.receiveCall("Anna");
//        phoneThree.receiveCall("Nikita");
//
//        phoneOne.receiveCall("Kirill", "+375 44 444-44-44");
//
//        Phone.sendMessage("Hello everyone! Today we are having a meet-up", "+375 25 111-11-11", "+375 29 222-22-22", "+375 44 333-33-33");

    }
}