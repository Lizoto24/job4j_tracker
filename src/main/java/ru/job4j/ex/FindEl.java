package ru.job4j.ex;

import java.util.Objects;

public class FindEl {
    public static int indexOf (String[] value, String key) throws ElementNotFoundException {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (Objects.equals(value[index], key)) {
                result = index;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException ("key element not found");
        }
        return result;
    }

    public static void main(String[] args) {
        String [] value =  new String [] {"Bars", "Shmers", "Fartik", "Panterik", "Smurfik", "Perzhiks" };
        String key = "Cheburek";
        try {
            indexOf(value,key);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
    }

