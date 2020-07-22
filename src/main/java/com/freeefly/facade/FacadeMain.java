package com.freeefly.facade;

import com.freeefly.facade.appliance.Amplifier;
import com.freeefly.facade.appliance.DvdPlayer;
import com.freeefly.facade.appliance.Projector;
import com.freeefly.facade.appliance.Tuner;

public class FacadeMain {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        DvdPlayer dvd = new DvdPlayer();
        Projector projector = new Projector();
        Tuner tuner = new Tuner();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, dvd, projector, tuner);
        homeTheaterFacade.watchMovie("Star wars - 1");
        homeTheaterFacade.endMovie();
    }
}
