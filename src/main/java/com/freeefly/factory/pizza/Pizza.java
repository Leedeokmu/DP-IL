package com.freeefly.factory.pizza;

import com.freeefly.factory.ingredient.*;

import java.util.List;

public abstract class Pizza {
    private String name;
    private Dough dough;
    private Sauce sauce;
    private List<Veggies> veggiesList;
    private Clams clams;
    private Pepperoni pepperoni;
    private Cheese cheese;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25min at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza ito diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public List<Veggies> getVeggiesList() {
        return veggiesList;
    }

    public void setVeggiesList(List<Veggies> veggiesList) {
        this.veggiesList = veggiesList;
    }

    public Clams getClams() {
        return clams;
    }

    public void setClams(Clams clams) {
        this.clams = clams;
    }

    public Pepperoni getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Pepperoni pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Cheese getCheese() {
        return cheese;
    }

    public void setCheese(Cheese cheese) {
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
