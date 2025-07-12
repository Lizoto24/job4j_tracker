package advanced.tasks;

import java.util.List;
import java.util.stream.Collectors;

public class BookSelector {
    public List<String> selectTopBooks(List<Book> books) {
        return books.stream()
                .distinct()
                .filter(book -> book.getRating() >= 4.0f)
                .sorted((b1, b2) -> Integer.compare(b2.getReviews(), b1.getReviews()))
                .limit(5)
                .map(book -> "Book :" + book.getTitle()
                        + ", Rating: " + book.getRating()
                        + ", Reviews: " + book.getReviews())
                .collect(Collectors.toList());
    }
}
