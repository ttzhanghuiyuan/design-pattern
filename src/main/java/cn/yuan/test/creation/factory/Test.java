package cn.yuan.test.creation.factory;

import cn.yuan.test.creation.factory.abstract_factory.AbstractFactory;
import cn.yuan.test.creation.factory.abstract_factory.ConcreteFactory1;
import cn.yuan.test.creation.factory.abstract_factory.ConcreteFactory2;
import cn.yuan.test.creation.factory.factory_method.ConcreteFactoryC;
import cn.yuan.test.creation.factory.factory_method.ConcreteFactoryD;
import cn.yuan.test.creation.factory.factory_method.Factory;
import cn.yuan.test.creation.factory.simple_factory.SimpleFactory;

public class Test {

    public static void main(String[] args) {
        //简单工厂
        SimpleFactory.createProduct("A").show();
        SimpleFactory.createProduct("B").show();

        System.out.println("简单工厂-----------------");

        //工厂方法
        Factory factory = new ConcreteFactoryC();
        factory.createProduct().show();

        Factory factory1 = new ConcreteFactoryD();
        factory1.createProduct().show();

        System.out.println("工厂方法-----------------");

        //抽象工厂
        AbstractFactory abstractFactory = new ConcreteFactory1();
        abstractFactory.createProductA().show();
        abstractFactory.createProductB().display();

        AbstractFactory abstractFactory1  = new ConcreteFactory2();
        abstractFactory1.createProductA().show();
        abstractFactory1.createProductB().display();

        System.out.println("抽象工厂-----------------");
    }
}
