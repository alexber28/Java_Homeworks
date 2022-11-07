package org.example.flowers;

public class Daisy extends Flower{
    private int numberOfFlowersInBranch;

    public Daisy(int price, int daysBeforeWilt, String color, int numberOfFlowersInBranch) {
        super(price, daysBeforeWilt, color);
        this.numberOfFlowersInBranch = numberOfFlowersInBranch;
    }

    public int getNumberOfFlowersInBranch() {
        return numberOfFlowersInBranch;
    }

    @Override
    public String toString() {
        return "Daisy{" + super.toString() +
                ", numberOfFlowersInBranch=" + numberOfFlowersInBranch +
                "}\n";
    }
}
