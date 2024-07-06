package designpatterns.factorymethod.avoidocpviolation.alternatefactory;

import designpatterns.factorymethod.avoidocpviolation.products.Product;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class ProductFactory {
    private static Map<String, Class<? extends Product>> productRegistry = new HashMap<>();

    public static void registerProduct(String type, Class<? extends Product> productClass){
        productRegistry.put(type,productClass);
    }

    public Product createProduct(String type) throws InstantiationException, IllegalAccessException, NoSuchMethodException {
        Class<? extends Product> productClass = productRegistry.get(type);
        Constructor<? extends Product> constructor = productClass.getConstructor();
        if(productClass != null){
            return productClass.newInstance();
//            return constructor.newInstance();
        }
        throw new IllegalArgumentException("Unknown product type: " + type);
    }
}
