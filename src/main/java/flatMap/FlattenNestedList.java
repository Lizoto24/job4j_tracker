package flatMap;

import java.util.List;
import java.util.stream.Collectors;

public class FlattenNestedList {
    public static void main(String[] args) {
        List<List<String>> nested = List.of(
                List.of("one","two","three","four","five"),
                List.of("six","seven"),
                List.of("eight","nine")
        );
        List<String> result = nested.stream()
                .flatMap(list -> list.stream())
                .filter(string -> string.length() > 4)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
