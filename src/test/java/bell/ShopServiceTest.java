package bell;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {
    @Test
    void addProduct() {
        ShopService shop = new ShopService();
        shop.addProduct("Хлеб", 3);
        List<String> list = shop.getProducts();
        assertTrue(list.size() == 1);
        assertTrue(list.contains("Хлеб"));
        assertTrue(shop.getProductQuantity("Хлеб") == 3);
    }

    @Test
    void removeProduct() {
        ShopService shop = new ShopService();
        shop.addProduct("Молоко", 7);
        shop.addProduct("Клубника", 15);
        shop.removeProduct("Клубника");
        List<String> list = shop.getProducts();
        assertTrue(list.size() == 1);
        assertTrue(list.contains("Молоко"));
    }

    @Test
    void updateProductQuantity() {
        ShopService shop = new ShopService();
        shop.addProduct("Кофе", 2);
        shop.addProduct("Апельсин", 1);
        shop.updateProductQuantity("Апельсин",6);
        assertTrue(shop.getProductQuantity("Апельсин") == 6);
    }

    @Test
    void clear() {
        ShopService shop = new ShopService();
        shop.addProduct("Яблоко", 8);
        shop.addProduct("Киви", 14);
        shop.clear();
        List<String> list = shop.getProducts();
        assertTrue(list.size() == 0);
    }
}