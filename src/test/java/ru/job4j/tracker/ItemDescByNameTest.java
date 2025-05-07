package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ItemDescByNameTest {
    @Test
    void whenDecrease() {
        Item item1 = new Item("Cat");
        Item item2 = new Item("Shmers");
        Item item3 = new Item("Bars");
        List <Item> items = Arrays.asList(item1, item2, item3);
        Collections.sort(items, new ItemDescByName());
        List <Item> expected = Arrays.asList(item2, item1, item3);
        assertEquals(items,(expected));
    }


}