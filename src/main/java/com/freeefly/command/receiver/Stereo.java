package com.freeefly.command.receiver;

public class Stereo {
    private String place;

    public Stereo(String place) {
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void on() {
        System.out.println(getPlace() + " Stereo is on");
    }

    public void off() {
        System.out.println(getPlace() + " Stereo is off");
    }
    public void setCD() {
        System.out.println(getPlace() + " Cd is set");
    }

    public void setVolume(int volume) {
        System.out.println(getPlace() + " Volume is set to " + volume);
    }
}
