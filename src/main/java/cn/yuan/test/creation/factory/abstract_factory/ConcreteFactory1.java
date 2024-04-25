package cn.yuan.test.creation.factory.abstract_factory;

public class ConcreteFactory1 implements AbstractFactory{
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
