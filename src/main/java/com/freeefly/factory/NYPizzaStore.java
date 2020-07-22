package com.freeefly.factory;

import com.freeefly.factory.factory.NYPizzaIngredientFactory;
import com.freeefly.factory.factory.PizzaIngredientFactory;
import com.freeefly.factory.pizza.CheesePizza;
import com.freeefly.factory.pizza.ClamPizza;
import com.freeefly.factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

        if (type.equals(PizzaType.CHEESE)) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals(PizzaType.CLAM)) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        return pizza;
    }
}
