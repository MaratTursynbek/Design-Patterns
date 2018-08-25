package com.marat.java.strategy.drivingbehavior;

public class BrokenCarSpecs implements DrivingSpecs {

    @Override
    public void drive() {
        System.out.println("I can't drive");
    }
}
