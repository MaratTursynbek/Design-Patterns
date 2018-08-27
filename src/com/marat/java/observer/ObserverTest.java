package com.marat.java.observer;

import com.marat.java.Tester;
import com.marat.java.observer.custom.CurrentConditionsDisplayCustom;
import com.marat.java.observer.custom.WeatherDataCustom;
import com.marat.java.observer.observable.CurrentConditionsDisplayObservable;
import com.marat.java.observer.observable.WeatherDataObservable;

public class ObserverTest implements Tester {

    @Override
    public void test() {
        // testing example created using java.util.Observable
        WeatherDataObservable weatherDataObservable = new WeatherDataObservable();
        CurrentConditionsDisplayObservable currentDisplayObservable = new CurrentConditionsDisplayObservable(weatherDataObservable);
        weatherDataObservable.setMeasurements(80, 65, 30.4f);
        weatherDataObservable.setMeasurements(82, 70, 29.2f);
        weatherDataObservable.setMeasurements(78, 90, 29.2f);

        // testing example created using Custom implementation of Observer pattern
        WeatherDataCustom weatherDataCustom = new WeatherDataCustom();
        CurrentConditionsDisplayCustom currentDisplayCustom = new CurrentConditionsDisplayCustom(weatherDataCustom);
        weatherDataCustom.setMeasurements(80, 65, 30.4f);
        weatherDataCustom.setMeasurements(82, 70, 29.2f);
        weatherDataCustom.setMeasurements(78, 90, 29.2f);
    }
}
