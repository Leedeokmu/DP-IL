package com.freeefly.iterator;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        Iterator dinerMenuIterator = dinerMenu.createIterator();
        Iterator pancakeHouseMenuIterator = pancakeHouseMenu.createIterator();

        dinerMenuIterator.next();
        pancakeHouseMenuIterator.next();
        dinerMenuIterator.remove();
        pancakeHouseMenuIterator.remove();

        System.out.println("메뉴\n----\n아침메뉴");
        printMenu(pancakeHouseMenuIterator);
        System.out.println("\n점심메뉴");
        printMenu(dinerMenuIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
