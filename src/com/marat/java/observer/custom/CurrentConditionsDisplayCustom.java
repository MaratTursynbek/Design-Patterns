package com.marat.java.observer.custom;

public class CurrentConditionsDisplayCustom implements Observer {

    private Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplayCustom(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    private void display() {
        System.out.println("Custom: Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
