package cn.yuan.test.creation.factory.simple_factory;

public class SimpleFactory {

    public static Product createProduct(String type)
    {
        Product product = null;
        if (type.equals("A"))
        {
            product = new ConcreteProductA();
        }
        else if (type.equals("B"))
        {
            product = new ConcreteProductB();
        }
        return product;
    }
}
