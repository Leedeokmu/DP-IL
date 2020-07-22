package com.freeefly.facade.appliance;

public class Amplifier {
    public void on() {
        System.out.println("Amplifier on");
    }

    public void setSurroundSound() {
        System.out.println("Set surround sound");
    }

    public void setVolume(int i) {
        System.out.println("Volume is " + i);
    }

    public void off() {
        System.out.println("Amplifier power off...");
    }
}
