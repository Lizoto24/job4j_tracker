package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CharsFromWords {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Java is powerful",
                "Streams are powerful",
                "Java streams");

        List<String> result = sentences.stream()
                .flatMap(sentence-> Arrays.stream(sentence.split(" ")))
                .map(word -> word.toLowerCase())
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
