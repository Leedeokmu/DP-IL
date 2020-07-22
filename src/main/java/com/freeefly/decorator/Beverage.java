package com.freeefly.decorator;

public abstract class Beverage {
    private String description = "음료";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();
}
