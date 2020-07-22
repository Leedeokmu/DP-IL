package com.freeefly.strategy;

public class FlyWihWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
