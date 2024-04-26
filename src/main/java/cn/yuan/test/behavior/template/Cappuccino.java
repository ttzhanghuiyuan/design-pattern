package cn.yuan.test.behavior.template;

public class Cappuccino extends Coffee{
    @Override
    void boilWater() {
        System.out.println("Boiling water for Cappuccino");
    }

    @Override
    void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee though filter.");
    }

    @Override
    void addCondiment() {
        System.out.println("Adding Milk Foam .");
    }
}
