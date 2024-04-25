package cn.yuan.test.behavior.mediator;

/**
 * 中介者接口
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-25 16:38:13
 */
public interface Mediator {
    void sendMessage(String message, Colleague colleague);
}
