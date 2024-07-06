package designpatterns.factorymethod.avoidocpviolation.productregistry;
import designpatterns.factorymethod.avoidocpviolation.products.Product;

import java.util.HashMap;
import java.util.Map;

public class ProductRegistry {
    private static Map<String, Class<? extends Product>> registry = new HashMap<>();

    public static void registerProduct(String type, Class<? extends Product> productClass) {
        registry.put(type, productClass);
    }

    public static Product createProduct(String type) throws IllegalAccessException, InstantiationException {
        Class<? extends Product> productClass = registry.get(type);
        if (productClass != null) {
            return productClass.newInstance();
        }
        throw new IllegalArgumentException("Unknown product type: " + type);
    }
}
