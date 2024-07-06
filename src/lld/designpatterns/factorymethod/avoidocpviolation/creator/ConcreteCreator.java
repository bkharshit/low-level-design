package designpatterns.factorymethod.avoidocpviolation.creator;

import designpatterns.factorymethod.avoidocpviolation.productregistry.ProductRegistry;
import designpatterns.factorymethod.avoidocpviolation.products.Product;

public class ConcreteCreator extends Creator {
    @Override
    public Product factoryMethod(String type) throws IllegalAccessException, InstantiationException {
        return ProductRegistry.createProduct(type);
    }
}