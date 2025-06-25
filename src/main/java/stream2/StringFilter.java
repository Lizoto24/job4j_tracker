package stream2;

import java.util.List;
import java.util.stream.Collectors;

public class StringFilter {
    public static List<String> filterLongNames(List<String> names) {
        return names.stream()
                .filter(string -> string.length() > 5)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("cat ", "monkey ", "crocodile ", "fish ", "bird ", "hamster ", "horse ");
        System.out.println(filterLongNames(names));
    }
}
