package ru.job4j.tracker;

import java.util.Objects;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] result = new Item [items.length];
        int size = 0;
        for (int index = 0; index < items.length ; index++) {
            Item i = items [index];
            if (i != null) {
                result [size] = i;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[items.length];
        int size = 0;
        for (int index = 0; index < items.length; index++) {
            Item item = items[index];
            if (Objects.equals(item.getName(), key)) {
                result [size] = item;
                size++;
            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items [index] = item;

        }
        return result;
    }

    public boolean delete (int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            System.arraycopy(items, index + 1, items, index, index + 1);
            items[size - 1] = null;
            size--;
        }
        return result;
    }

    private int indexOf(int id) {
        int result = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                result = index;
                break;
            }
        }
        return result;
    }
}