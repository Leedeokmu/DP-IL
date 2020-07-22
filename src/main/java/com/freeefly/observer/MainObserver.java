package com.freeefly.observer;

public class MainObserver {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DisplayElement display = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(28.2f, 30.3f, 20.2f);

    }
}
