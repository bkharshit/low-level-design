package designpatterns.factorymethod.avoidocpviolation.alternatefactory;

import designpatterns.factorymethod.avoidocpviolation.productregistry.ProductRegistry;
import designpatterns.factorymethod.avoidocpviolation.products.ConcreteProductA;
import designpatterns.factorymethod.avoidocpviolation.products.ConcreteProductB;
import designpatterns.factorymethod.avoidocpviolation.products.ConcreteProductC;

public class ProductRegistration {
    public static void register(){
        ProductRegistry.registerProduct("A", ConcreteProductA.class);
        ProductRegistry.registerProduct("B", ConcreteProductB.class);
//        ProductRegistry.registerProduct("C", ConcreteProductC.class);
    }
}
