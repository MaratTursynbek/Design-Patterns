package com.marat.java.observer.observable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplayObservable implements Observer {

    private Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayObservable(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherDataObservable) {
            WeatherDataObservable weatherDataObservable = (WeatherDataObservable) o;
            this.temperature = weatherDataObservable.getTemperature();
            this.humidity = weatherDataObservable.getHumidity();
            display();
        }
    }

    private void display() {
        System.out.println("Observer: Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
