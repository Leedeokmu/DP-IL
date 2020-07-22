package com.freeefly.iterator;

import java.util.Iterator;

public class DinerMenu {
    static final  int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("채식주의자용 BLT1", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴1", true, 2.99);
        addItem("채식주의자용 BLT2", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴2", false, 3.99);
        addItem("채식주의자용 BLT3", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴3", true, 5.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("죄송합니다 메뉴가 꽉 찻네요");

        }else {
            menuItems[numberOfItems++] = item;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
