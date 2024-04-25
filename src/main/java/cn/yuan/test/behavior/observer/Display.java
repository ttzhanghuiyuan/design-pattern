package cn.yuan.test.behavior.observer;

/**
 * 具体观察者
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-25 15:33:37
 */
public class Display implements Observer{

    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}
