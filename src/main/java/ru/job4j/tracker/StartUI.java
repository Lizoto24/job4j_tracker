package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item("cat");
        System.out.println(item.getCreated());
        LocalDateTime currentDateTimeFormat = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat.format(formatter));
        Item item1 = new Item (987, "Cat");
        System.out.println(item1);
    }
    }

