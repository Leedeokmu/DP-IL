package com.freeefly.factory.factory;

import com.freeefly.factory.ingredient.*;

import java.util.ArrayList;
import java.util.List;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        List<Veggies> veggies = new ArrayList<>();
        veggies.add(new Garlic());
        veggies.add(new RedPepper());
        veggies.add(new Mushroom());
        veggies.add(new Onion());
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

}
