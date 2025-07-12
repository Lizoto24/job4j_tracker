package advanced.tasks;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(new Book("Java 101", 4.5f, 120),
                new Book("Python Basics", 4.7f, 95),
                new Book("C++ for Pros", 3.9f, 80),
                new Book("Effective Java", 4.9f, 300),
                new Book("Clean Code", 4.8f, 250),
                new Book("Java 101", 4.5f, 120), // дубликат по имени
                new Book("Algorithms", 4.6f, 210));

        BookSelector selector = new BookSelector();
        List<String> result = selector.selectTopBooks(books);
        result.forEach(book -> System.out.println(book));
    }
}
