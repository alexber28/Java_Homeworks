package org.example.appliances;

import java.sql.Time;

public class DishWasher extends Device{
    private Time timeOfWork;

    public DishWasher(int powerRequired, String manufacturer, Time timeOfWork) {
        super(powerRequired, manufacturer);
        this.timeOfWork = timeOfWork;
    }

    public Time getTimeOfWork() {
        return timeOfWork;
    }

    public void setTimeOfWork(Time timeOfWork) {
        this.timeOfWork = timeOfWork;
    }

    @Override
    public String toString() {
        return "DishWasher{"  + super.toString() +
                ", timeOfWork=" + timeOfWork +
                '}';
    }
}
