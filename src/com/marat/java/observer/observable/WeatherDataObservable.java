package com.marat.java.observer.observable;

import java.util.Observable;

public class WeatherDataObservable extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDataObservable() {}

    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    float getTemperature() {
        return temperature;
    }

    float getHumidity() {
        return humidity;
    }

    float getPressure() {
        return pressure;
    }
}
