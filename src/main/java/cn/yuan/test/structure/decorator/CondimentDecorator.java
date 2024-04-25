package cn.yuan.test.structure.decorator;

public abstract class CondimentDecorator implements Coffee{

    protected Coffee coffee;

    public CondimentDecorator(Coffee coffee){
        this.coffee = coffee;
    }
}
