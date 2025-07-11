package advanced.tasks;

import java.util.Objects;

public class Product {
    private String name;
    private float price;
    private int sales;
    private float rating;

    public Product(String name, float price, int sales, float rating) {
        this.name = name;
        this.price = price;
        this.sales = sales;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getSales() {
        return sales;
    }

    public float getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Float.compare(price, product.price) == 0 && sales == product.sales && Float.compare(rating, product.rating) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, sales, rating);
    }
}
