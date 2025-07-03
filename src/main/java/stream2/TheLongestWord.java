package stream2;

import java.util.Comparator;
import java.util.List;

public class TheLongestWord {
    public static void main(String[] args) {
        List<String> words = List.of("relinquish", "apple", "oversimplistic", "conscientious");
        String result = words.stream()
                .max(Comparator.comparingInt(word -> word.length()))
                        .orElse("  ");

        System.out.println(result);
    }
}
