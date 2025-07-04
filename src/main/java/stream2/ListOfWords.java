package stream2;

import java.util.List;
import java.util.stream.Collectors;

public class ListOfWords {
    public static void main(String[] args) {
        List<String> words = List.of("cat","dog","hamster","dog", "puppy", "cat", "monkey", "cow","hamster" );
        List<String> unique = words.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique);
    }
}
