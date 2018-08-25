package com.marat.java.strategy.cars;

import com.marat.java.strategy.drivingbehavior.DrivingSpecs;

abstract public class Car {

    private DrivingSpecs drivingSpecs;
    private String name;

    Car(String name, DrivingSpecs drivingSpecs) {
        this.name = name;
        this.drivingSpecs = drivingSpecs;
    }

    public void whatIsThisCar() {
        System.out.println("I'm " + name);
    }

    public void performDrive() {
        drivingSpecs.drive();
    }

    public void setDrivingSpecs(DrivingSpecs drivingSpecs) {
        this.drivingSpecs = drivingSpecs;
    }
}
