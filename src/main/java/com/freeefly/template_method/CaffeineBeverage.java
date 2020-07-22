package com.freeefly.template_method;

public interface CaffeineBeverage {
    default void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void brew();
    void addCondiments();

    default void boilWater() {
        System.out.println("boiling water...");
    }

    default void pourInCup() {
        System.out.println("컵에 따르는 중...");
    }
}
