package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNegativeNumbers {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(-14,5,17,-56,78,-3);
        List<Integer> positive = numbers.stream().filter(n-> n>0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}