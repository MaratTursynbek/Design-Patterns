package com.marat.java.strategy.cars;

import com.marat.java.strategy.drivingbehavior.SportCarSpecs;

public class SportCar extends Car {

    public SportCar(String name) {
        super(name, new SportCarSpecs());
    }
}
