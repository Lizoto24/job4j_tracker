package advanced.tasks;

import java.util.List;
import java.util.stream.Collectors;

public class PremiumLabelGenerator {
    public List<String> generateLabels(List<Product> products) {
        List<String> result = products.stream()
                .filter(product -> product.getRating() >= 4.5f)
                .filter(product -> product.getSales() >= 100)
                .map(product -> new Label(product.getName(), product.getPrice() * 1.2f))
                .map(label -> label.toString())
                .collect(Collectors.toList());

        return result;
    }
}
