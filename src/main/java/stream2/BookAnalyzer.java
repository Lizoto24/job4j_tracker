package stream2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BookAnalyzer {
    public static void main(String[] args) {
        List<Genre> genres = List.of(
                new Genre("Fantasy", List.of(
                        new Book("The Witcher", 4.8, 2016),
                        new Book("Eragon", 4.2, 2002)
                )),
                new Genre("Sci-Fi", List.of(
                        new Book("Dune", 4.9, 2020),
                        new Book("Foundation", 4.3, 2015)
                )),
                new Genre("Thriller", List.of(
                        new Book("Gone Girl", 4.7, 2017),
                        new Book("The Girl with the Dragon Tattoo", 4.5, 2011)
                ))
        );

        List<String> topBooks = genres.stream()
                .flatMap(genre -> genre.getBooks().stream())
                .filter(book -> book.getYear() > 2015)
                .sorted(Comparator.comparingDouble(Book::getRating).reversed())
                .limit(3)
                .map(book -> book.getTitle())
                .collect(Collectors.toList());

        System.out.println("Top three books: ");
        topBooks.forEach(title -> System.out.println(title));
    }
}
