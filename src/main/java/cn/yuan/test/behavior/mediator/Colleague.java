package cn.yuan.test.behavior.mediator;

/**
 * 同事接口
 *
 * @author abner<huiyuan.zhang @ hex-tech.net>
 * @date 2024-04-25 16:41:19
 */
public interface Colleague {
    void sendMessage(String message);

    void receiveMessage(String message);
}
