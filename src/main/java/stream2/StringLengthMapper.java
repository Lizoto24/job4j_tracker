package stream2;

import java.util.List;
import java.util.stream.Collectors;

public class StringLengthMapper {
    public static List<Integer> mapToLength (List<String> names) {
        return names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());
    }

    public static void main (String [] args) {
        List <String> names = List.of("apple ", "banana ", "orange ", "pear ", "lime ","fig");
        System.out.println(mapToLength(names));
    }
}
