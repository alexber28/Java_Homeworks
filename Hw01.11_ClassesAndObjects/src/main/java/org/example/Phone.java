package org.example;

import java.sql.SQLOutput;

public class Phone {
    private String name;
    private String number;
    private String model;
    private int weight;

    public Phone(String name, String number, String model, int weight) {
        this.name = name;
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void receiveCall(String name) {
        System.out.println("Звонит: " + name + " на " + getNumber());
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит: " + name + " " + number + " на " + getNumber());
    }

    public static void sendMessage(String message, String... args) {
        System.out.println("This message is sent:\n" + message + "\nto:");
        for (String str :
                args) {
            System.out.println(str);
        }

    }
}
