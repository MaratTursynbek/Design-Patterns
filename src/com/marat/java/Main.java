package com.marat.java;

import com.marat.java.decorator.DecoratorTester;

public class Main {

    public static void main(String[] args) {
        Tester strategyTester = new DecoratorTester();
        strategyTester.test();
    }
}
