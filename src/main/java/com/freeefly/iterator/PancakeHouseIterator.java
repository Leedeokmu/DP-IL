package com.freeefly.iterator;

import java.util.Iterator;
import java.util.List;


public class PancakeHouseIterator implements Iterator {
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        return menuItems.get(position++);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
