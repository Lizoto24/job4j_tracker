package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MatrixToList {

    public static List<Integer> convert(Integer[][] matrix) {
        return Stream.of(matrix)
                .flatMap(element -> Arrays.stream(element))
                .collect(Collectors.toList());
    }
}