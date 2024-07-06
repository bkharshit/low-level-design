package designpatterns.factorymethod.avoidocpviolation.creator;

import designpatterns.factorymethod.avoidocpviolation.products.Product;

public abstract class Creator {
    public abstract Product factoryMethod(String type) throws IllegalAccessException, InstantiationException;

    public void anOperation(String type) throws IllegalAccessException, InstantiationException {
        Product product = factoryMethod(type);
        product.use();
    }
}