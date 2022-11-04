package org.example.appliances;

public class Computer extends Device{
    private int ram;

    public Computer(int powerRequired, String manufacturer, int ram) {
        super(powerRequired, manufacturer);
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" + super.toString() +
                ", ram=" + ram +
                '}';
    }
}
