package com.freeefly.factory.factory;

import com.freeefly.factory.ingredient.*;

import java.util.List;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    List<Veggies> createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();



}
