package com.marat.java.observer.pcl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class WeatherDataPCL {

    private WeatherObject weatherObject;

    private PropertyChangeSupport support;

    public WeatherDataPCL() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        WeatherObject weatherObject = new WeatherObject(temperature, humidity, pressure);
        support.firePropertyChange("data", this.weatherObject, weatherObject);
    }
}
