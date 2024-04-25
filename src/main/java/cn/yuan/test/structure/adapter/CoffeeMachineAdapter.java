package cn.yuan.test.structure.adapter;

public class CoffeeMachineAdapter implements CoffeeMachine{
    private OldCoffeeMachine oldCoffeeMachine;

    public CoffeeMachineAdapter(OldCoffeeMachine oldCoffeeMachine) {
        this.oldCoffeeMachine = oldCoffeeMachine;
    }

    @Override
    public void chooseFirstSelection() {
        oldCoffeeMachine.selectA();
    }

    @Override
    public void chooseSecondSelection() {
        oldCoffeeMachine.selectB();
    }
}
