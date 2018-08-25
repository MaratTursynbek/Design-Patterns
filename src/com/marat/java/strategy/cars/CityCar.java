package com.marat.java.strategy.cars;

import com.marat.java.strategy.drivingbehavior.CityCarSpecs;

public class CityCar extends Car {

    CityCar(String name) {
        super(name, new CityCarSpecs());
    }
}
