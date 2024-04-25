package cn.yuan.test.creation.factory.factory_method;

import cn.yuan.test.creation.factory.simple_factory.ConcreteProductA;
import cn.yuan.test.creation.factory.simple_factory.Product;

public class ConcreteFactoryC implements Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
