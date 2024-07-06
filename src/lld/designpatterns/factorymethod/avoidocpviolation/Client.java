package designpatterns.factorymethod.avoidocpviolation;

import designpatterns.factorymethod.avoidocpviolation.creator.ConcreteCreator;
import designpatterns.factorymethod.avoidocpviolation.creator.Creator;
import designpatterns.factorymethod.avoidocpviolation.productregistry.ProductRegistration;

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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
