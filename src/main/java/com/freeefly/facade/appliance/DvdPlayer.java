package com.freeefly.facade.appliance;

public class DvdPlayer {
    public void on() {
        System.out.println("dvd power on");
    }

    public void play(String movie) {
        System.out.println("Now play " + movie);
    }

    public void stop() {
        System.out.println("Now stop movie");
    }

    public void eject() {
        System.out.println("eject movie dvd");
    }

    public void off() {
        System.out.println("Dvd Player power off...");
    }
}
