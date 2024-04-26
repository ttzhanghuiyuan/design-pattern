package cn.yuan.test.behavior.template;

abstract class Coffee {

    public final void makeCoffee(){
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addCondiment();
        System.out.println("Coffee is ready!");
    }

    abstract void boilWater();

    abstract void brewCoffeeGrinds();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    abstract void addCondiment();
}
