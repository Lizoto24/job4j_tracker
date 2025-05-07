package ru.job4j.tracker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemAscByNameTest {
    @Test
    void whenIncrease() {
        Item item1 = new Item("Cat");
        Item item2 = new Item("Shmers");
        Item item3 = new Item("Bars");
        List <Item> items = Arrays.asList(item1, item2, item3);
        Collections.sort(items, new ItemAscByName());
        List <Item> expected = Arrays.asList(item3, item1, item2);
        assertEquals(items,(expected));
    }



}