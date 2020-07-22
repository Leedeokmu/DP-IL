package com.freeefly.factory.pizza;

import com.freeefly.factory.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(pizzaIngredientFactory.createDough());
        setCheese(pizzaIngredientFactory.createCheese());
        setSauce(pizzaIngredientFactory.createSauce());
        setClams(pizzaIngredientFactory.createClams());

//        setPepperoni(pizzaIngredientFactory.createPepperoni());
//        setVeggiesList(pizzaIngredientFactory.createVeggies());
    }
}
