package cn.yuan.test.behavior.state;

/**
 * 状态抽象接口
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-26 15:03:01
 */
public interface State {
    void turnOn();
    void turnOff();
    void brighten();
    void dim();
}
