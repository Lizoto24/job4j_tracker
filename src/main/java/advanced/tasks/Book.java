package advanced.tasks;

import java.util.Objects;

public class Book {
    private String title;
    private float rating;
    private int reviews;

    public Book(String title, float rating, int reviews) {
        this.title = title;
        this.rating = rating;
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public float getRating() {
        return rating;
    }

    public int getReviews() {
        return reviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}





