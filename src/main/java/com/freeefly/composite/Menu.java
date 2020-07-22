package com.freeefly.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu implements MenuComponent{
    List<MenuComponent> menuComponents = new ArrayList<>();
    private String name;
    private String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(",  " + getDescription());
        System.out.println("----------------------");
        Iterator iterator = menuComponents.iterator();
        while (iterator.hasNext()) {
            MenuComponent next = (MenuComponent)iterator.next();
            next.print();
        }
    }
}
