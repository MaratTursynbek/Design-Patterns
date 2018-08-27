package com.marat.java.strategy;

import com.marat.java.Tester;
import com.marat.java.strategy.cars.Car;
import com.marat.java.strategy.cars.SportCar;
import com.marat.java.strategy.drivingbehavior.BrokenCarSpecs;
import com.marat.java.strategy.drivingbehavior.CityCarSpecs;

public class StrategyTester implements Tester {

    public void test() {
        Car car = new SportCar("Tesla Roadster 2");
        car.whatIsThisCar();
        car.performDrive();

        car.setDrivingSpecs(new CityCarSpecs());
        car.performDrive();

        car.setDrivingSpecs(new BrokenCarSpecs());
        car.performDrive();
    }
}
