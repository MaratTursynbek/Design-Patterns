package com.marat.java.strategy.drivingbehavior;

public class CityCarSpecs implements DrivingSpecs {

    @Override
    public void drive() {
        System.out.println("I'm driving with speed of 60 km/hour");
    }
}
