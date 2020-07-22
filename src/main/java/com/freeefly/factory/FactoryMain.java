package com.freeefly.factory;

public class FactoryMain {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        pizzaStore.orderPizza(PizzaType.CHEESE);
    }
}
