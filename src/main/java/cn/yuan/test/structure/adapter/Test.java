package cn.yuan.test.structure.adapter;

public class Test {

    public static void main(String[] args) {
        OldCoffeeMachine oldCoffeeMachine = new OldCoffeeMachine();
        CoffeeMachineAdapter coffeeMachineAdapter = new CoffeeMachineAdapter(oldCoffeeMachine);

        coffeeMachineAdapter.chooseFirstSelection();
        coffeeMachineAdapter.chooseSecondSelection();
    }
}
