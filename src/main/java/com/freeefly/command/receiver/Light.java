package com.freeefly.command.receiver;


public class Light {
    private String place;

    public Light(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void on() {
        System.out.println(getPlace() + " Light is on");
    }

    public void off() {
        System.out.println(getPlace() +  " Light is off");
    }
}
