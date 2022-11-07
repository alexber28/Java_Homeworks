package org.example.appliances;

public class TV extends Device{
    private int numberOfChannels;

    public TV(int powerRequired, String manufacturer, int numberOfChannels) {
        super(powerRequired, manufacturer);
        this.numberOfChannels = numberOfChannels;
    }

    public int getNumberOfChannels() {
        return numberOfChannels;
    }

    public void setNumberOfChannels(int numberOfChannels) {
        this.numberOfChannels = numberOfChannels;
    }

    @Override
    public String toString() {
        return "TV{"  + super.toString() +
                ", numberOfChannels=" + numberOfChannels +
                '}';
    }
}
