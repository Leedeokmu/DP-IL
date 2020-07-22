package com.freeefly.facade;

import com.freeefly.facade.appliance.Amplifier;
import com.freeefly.facade.appliance.DvdPlayer;
import com.freeefly.facade.appliance.Projector;
import com.freeefly.facade.appliance.Tuner;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private Tuner tuner;

    public HomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Projector projector, Tuner tuner) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.tuner = tuner;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        amplifier.on();
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
