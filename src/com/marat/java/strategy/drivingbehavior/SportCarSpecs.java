package com.marat.java.strategy.drivingbehavior;

public class SportCarSpecs implements DrivingSpecs {

    @Override
    public void drive() {
        System.out.println("I'm driving with speed of 250 km/hour");
    }
}
