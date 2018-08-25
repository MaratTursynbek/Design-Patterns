package com.marat.java.strategy.cars;

import com.marat.java.strategy.drivingbehavior.BrokenCarSpecs;

public class BrokenCar extends Car {

    BrokenCar(String name) {
        super(name, new BrokenCarSpecs());
    }
}
