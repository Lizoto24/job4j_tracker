package stream2;

import java.util.List;
import java.util.stream.Collectors;

public class JoinedStrings {
    public static void main(String[] args) {
        List<String> words = List.of("cat","dog","hamster","puppy","monkey", "cow");
        String joined = words.stream()
                .collect(Collectors.joining(", "));

        System.out.println(joined);
    }
}
