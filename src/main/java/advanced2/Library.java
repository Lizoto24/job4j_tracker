package advanced2;

import java.util.List;

public class Library {
    private String title;
    private List<Book> books;

    public Library (String title, List<Book> books) {
        this.title = title;
        this.books = books;
    }

    public String getTitle() {
        return title;
    }

    public List<Book> getBooks() {
        return books;
    }
}
