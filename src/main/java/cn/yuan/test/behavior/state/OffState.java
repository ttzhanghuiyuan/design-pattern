package cn.yuan.test.behavior.state;

public class OffState implements State{
    @Override
    public void turnOn() {
        System.out.println("turning on the light");
    }

    @Override
    public void turnOff() {
        System.out.println("light is already off");
    }

    @Override
    public void brighten() {
        System.out.println("cannot brighten the light when it's off");
    }

    @Override
    public void dim() {
        System.out.println("cannot dim the light when it's off");
    }
}
