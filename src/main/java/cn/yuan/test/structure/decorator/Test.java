package cn.yuan.test.structure.decorator;

public class Test {

    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println(espresso.getDescription() + " ¥" + espresso.cost());

        Milk espressoWithMilk = new Milk(espresso);
        System.out.println(espressoWithMilk.getDescription() + " ¥" + espressoWithMilk.cost());

        Sugar espressoWithMilkAndSugar = new Sugar(espressoWithMilk);
        System.out.println(espressoWithMilkAndSugar.getDescription() + " ¥" + espressoWithMilkAndSugar.cost());
    }
}
