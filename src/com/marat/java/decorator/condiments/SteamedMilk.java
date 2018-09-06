package com.marat.java.decorator.condiments;

import com.marat.java.decorator.coffees.Beverage;

public class SteamedMilk extends CondimentDecorator {

    private Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steam Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
