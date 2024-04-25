package cn.yuan.test.structure.decorator;

public class Milk extends CondimentDecorator{

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }
}
