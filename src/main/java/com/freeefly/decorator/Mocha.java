package com.freeefly.decorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return this.beverage.cost() + .20;
    }
}
