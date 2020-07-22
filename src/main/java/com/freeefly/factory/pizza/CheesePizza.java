package com.freeefly.factory.pizza;

import com.freeefly.factory.factory.PizzaIngredientFactory;

import javax.xml.namespace.QName;

public class CheesePizza extends Pizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + getName());
        setDough(pizzaIngredientFactory.createDough());
        setCheese(pizzaIngredientFactory.createCheese());
        setSauce(pizzaIngredientFactory.createSauce());

//        setClams(pizzaIngredientFactory.createClams());
//        setPepperoni(pizzaIngredientFactory.createPepperoni());
//        setVeggiesList(pizzaIngredientFactory.createVeggies());
    }
}
