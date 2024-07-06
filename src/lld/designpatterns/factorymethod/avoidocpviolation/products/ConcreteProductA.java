package designpatterns.factorymethod.avoidocpviolation.products;

public class ConcreteProductA implements Product {
    public void use() {
        System.out.println("Using ConcreteProductA");
    }
}