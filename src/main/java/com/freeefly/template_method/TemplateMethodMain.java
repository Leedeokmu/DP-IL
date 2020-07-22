package com.freeefly.template_method;

public class TemplateMethodMain {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}

