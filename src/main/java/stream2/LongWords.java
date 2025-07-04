package stream2;

import java.util.List;

public class LongWords {
    public static void main(String[] args) {
        List<String> words = List.of("egg", "milk", "chicken", "juice", "tea", "butter", "ham", "pie");
        long count = words.stream()
                .filter(word -> word.length() > 4)
                .count();

        System.out.println(count);

    }
}
