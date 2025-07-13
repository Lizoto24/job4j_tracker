package advanced2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LibraryAnalysis {
    public static void main(String[] args) {
        List<Library> libraries = List.of(
                new Library("Central", List.of(
                        new Book("Java Basics", List.of("Alice")),
                        new Book("Advanced Java", List.of("Alice", "Bob")),
                        new Book("Spring in action", List.of("Charlie", "Lisa"))
                )),
                new Library("Community", List.of(
                        new Book("Python Guide", List.of("Eve")),
                        new Book("Machine Learning", List.of("Kate", "Frank")),
                        new Book("Deep learning", List.of("Alice"))
                ))
        );
        List<String> uniqueAuthors = libraries.stream()
                .flatMap(library -> library.getBooks().stream())
                .flatMap(book -> book.getAuthors().stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Cписок уникальных авторов :" + uniqueAuthors);

        Optional<Library> libraryMaxBooks = libraries.stream()
                .max(Comparator.comparingLong(library -> library.getBooks().stream()
                        .filter(book -> book.getAuthors().size() > 1)
                        .count()
                ));
        libraryMaxBooks.ifPresent(library -> System.out.println("Книга с наибольшим числом книг с несколькими авторами  :" + library.getTitle()));


    }
}
