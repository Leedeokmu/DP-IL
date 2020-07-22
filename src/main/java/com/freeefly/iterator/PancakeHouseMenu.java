package com.freeefly.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PancakeHouseMenu implements Menu{
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        addItem("K&B 팬케이크 세트1", "스크램블드 에그와 토스트가 곁들여진 팬케ㅇ크1", true, 2.99);
        addItem("K&B 팬케이크 세트2", "스크램블드 에그와 토스트가 곁들여진 팬케ㅇ크2", false, 3.99);
        addItem("K&B 팬케이크 세트3", "스크램블드 에그와 토스트가 곁들여진 팬케ㅇ크3", true, 4.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menuItems.add(item);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.iterator();
    }
}
