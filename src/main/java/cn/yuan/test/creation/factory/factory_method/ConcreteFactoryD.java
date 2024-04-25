package cn.yuan.test.creation.factory.factory_method;

import cn.yuan.test.creation.factory.simple_factory.ConcreteProductB;
import cn.yuan.test.creation.factory.simple_factory.Product;

public class ConcreteFactoryD implements Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
