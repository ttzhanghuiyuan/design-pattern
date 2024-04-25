package cn.yuan.test.behavior.mediator;

/**
 * 具体同事
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-25 16:41:44
 */
public class User implements Colleague{
    private String name;
    private Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + "sends message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + "receives message: " + message);
    }
}
