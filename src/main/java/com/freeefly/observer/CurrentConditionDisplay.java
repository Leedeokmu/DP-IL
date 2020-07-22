package com.freeefly.observer;

import java.util.function.DoubleToIntFunction;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("temp : " + temp + ", humidity : " + humidity + ", pressure : " + pressure);
    }

    @Override
    public void update(Float temp, Float humidity, Float pressure) {
        this.temp = temp;
        this.humidity = hashCode();
        this.pressure = pressure;
        display();
    }
}
