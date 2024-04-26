package cn.yuan.test.behavior.template;

public class Test {

    public static void main(String[] args) {
        Coffee cappuccino = new Cappuccino();
        cappuccino.makeCoffee();

        System.out.println();

        BlackCoffee blackCoffee = new BlackCoffee();
        blackCoffee.makeCoffee();
    }
}
