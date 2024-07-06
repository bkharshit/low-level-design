package designpatterns.factorymethod.avoidocpviolation;

import designpatterns.factorymethod.avoidocpviolation.alternatefactory.ProductFactory;
import designpatterns.factorymethod.avoidocpviolation.creator.ConcreteCreator;
import designpatterns.factorymethod.avoidocpviolation.creator.Creator;
import designpatterns.factorymethod.avoidocpviolation.productregistry.ProductRegistration;
import designpatterns.factorymethod.avoidocpviolation.products.Product;

public class Client {
    public static void main(String[] args) {
        try {
            // Initialize product registration
//            Class.forName("ProductRegistration");             if u are using a static block to just initialize the values
            ProductRegistration.register();
            Creator creator = new ConcreteCreator();
            creator.anOperation("A"); // Output: Using ConcreteProductA
            creator.anOperation("B"); // Output: Using ConcreteProductB
            creator.anOperation("C"); // Output: Using ConcreteProductB


            Product productA = ProductFactory.createProduct("A");
            Product productB = ProductFactory.createProduct("B");
            Product productC = ProductFactory.createProduct("C");
            productA.use();
            productB.use();
            productC.use();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
