package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map <String,String> map = new HashMap<>();
        map.put("lizoto@yandex.ru", "Cat Catovich");
        map.put("alexeymerkulovv@yandex.ru", "Bars Barsovich");
        map.put("cheburkolymbia@yandex.ru", "Cheburahtor");
        map.put("mihailes@yandex.ru", "Byblik Lesnoy");
        map.put("bigmouse@yandex.ru", "Burger");

        for (String key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key +  " - " + value );
        }
    }

}
