package cn.yuan.test.behavior.state;

/**
 * 具体状态
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-26 15:03:36
 */
public class OnState implements State{
    @Override
    public void turnOn() {
        System.out.println("the light is already on");
    }

    @Override
    public void turnOff() {
        System.out.println("turn off the light");
    }

    @Override
    public void brighten() {
        System.out.println("brightening the light");
    }

    @Override
    public void dim() {
        System.out.println("dimming the light");
    }
}
