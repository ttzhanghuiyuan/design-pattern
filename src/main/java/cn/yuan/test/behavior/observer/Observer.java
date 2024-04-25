package cn.yuan.test.behavior.observer;

/**
 * 观察者接口
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-25 15:28:52
 */
public interface Observer {
    void update(float temperature, float humidity);
}
