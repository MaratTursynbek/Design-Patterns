package com.marat.java.decorator.condiments;

import com.marat.java.decorator.coffees.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
