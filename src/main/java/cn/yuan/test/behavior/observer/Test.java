package cn.yuan.test.behavior.observer;

public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Display display = new Display();

        weatherData.addObserver(display);

        weatherData.setMeasurements(10, 20);
        weatherData.setMeasurements(30, 40);
    }
}
