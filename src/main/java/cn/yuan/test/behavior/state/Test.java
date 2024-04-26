package cn.yuan.test.behavior.state;

public class Test {

    public static void main(String[] args) {
        LightController lightController = new LightController();


        lightController.turnOn();
        lightController.brighten();
        lightController.turnOff();
        lightController.dim();
    }
}
