package com.marat.java.observer.pcl;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CurrentConditionsDisplayPCL implements PropertyChangeListener {

    private WeatherObject weatherObject = null;

    public CurrentConditionsDisplayPCL(WeatherDataPCL weatherDataPCL) {
        weatherDataPCL.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("data")) {
            weatherObject = (WeatherObject) evt.getNewValue();
            display();
        }
    }

    private void display() {
        System.out.println("PCL: Current conditions: "
                + weatherObject.getTemperature() + "F degrees and "
                + weatherObject.getHumidity() + "% humidity and "
                + weatherObject.getPressure() + " pressure");
    }
}
