package com.marat.java.decorator;

import com.marat.java.Tester;
import com.marat.java.decorator.coffees.Beverage;
import com.marat.java.decorator.coffees.DarkRoast;
import com.marat.java.decorator.coffees.Espresso;
import com.marat.java.decorator.coffees.HouseBlend;
import com.marat.java.decorator.condiments.Mocha;
import com.marat.java.decorator.condiments.Soy;
import com.marat.java.decorator.condiments.Whip;

public class DecoratorTester implements Tester {

    @Override
    public void test() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
