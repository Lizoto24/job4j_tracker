
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopService implements Basket {
    private final Map <String, Integer> map = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        map.putIfAbsent(product,quantity);
    }

    @Override
    public void removeProduct(String product) {
        map.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
       map.put(product,quantity);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public List<String> getProducts() {
        return new ArrayList<>(map.keySet());
    }

    @Override
    public int getProductQuantity(String product) {
        return map.get(product);
    }
}
