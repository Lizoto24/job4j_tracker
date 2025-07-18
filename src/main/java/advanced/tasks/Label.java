package advanced.tasks;

import java.util.Objects;

public class Label {
    private String name;
    private float price;

    public Label(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Label label = (Label) o;
        return Float.compare(price, label.price) == 0 && Objects.equals(name, label.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
