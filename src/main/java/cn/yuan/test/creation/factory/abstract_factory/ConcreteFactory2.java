package cn.yuan.test.creation.factory.abstract_factory;

public class ConcreteFactory2 implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
