package ru.job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        for (String item: origin) {
            check.add(item);
        }
        for (String value: text)
            if (!check.contains(value)){
                result = false;
        }
        return result;
    }
}
