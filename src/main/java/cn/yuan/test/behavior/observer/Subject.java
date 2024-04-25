package cn.yuan.test.behavior.observer;

/**
 * 主题接口
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-25 15:28:04
 */
public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
