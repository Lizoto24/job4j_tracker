package ru.job4j.collectionexercise;

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        if (list.isEmpty()) {
            return "";
        } else {
            return list.get(0);
        }

    }
}