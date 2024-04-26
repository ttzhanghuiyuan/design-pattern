package cn.yuan.test.behavior.template;

public class BlackCoffee extends Coffee{
    @Override
    void boilWater() {
        System.out.println("BlackCoffee boiling water");
    }

    @Override
    void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter .");
    }

    @Override
    void addCondiment() {
        System.out.println("Adding Sugar and Milk");
    }
}
