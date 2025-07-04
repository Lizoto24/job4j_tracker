package stream2;

import java.util.List;
import java.util.stream.Collectors;

public class NestedListsUnpacking {
    public static void main(String[] args) {
        List<List<String>> nested = List.of(
                List.of("a", "b", "c"),
                List.of("d", "e"),
                List.of("f"),
                List.of("g", "h")
        );
        List<String> result = nested.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
