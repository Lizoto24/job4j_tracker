package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    public List<Double> diapason(int start, int end, Function<Double, Double> function) {
        ArrayList <Double> list = new ArrayList<>();
        for (int i = start; i < end ; i++) {
            double d = (double) i;
            list.add(function.apply(d));
        }
        return list;
    }
}