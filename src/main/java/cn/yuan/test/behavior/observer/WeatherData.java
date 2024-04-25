package cn.yuan.test.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题
 * @author abner<huiyuan.zhang@hex-tech.net>
 * @date 2024-04-25 15:30:14
 */
public class WeatherData implements Subject{
    private float temperature;
    private float humidity;
    private List<Observer> observers = new ArrayList<>();

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
           observer.update(temperature, humidity);
        }
    }
}
