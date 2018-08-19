package observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    
    
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData() {
        // TODO Auto-generated constructor stub
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        // TODO Auto-generated method stub
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        // TODO Auto-generated method stub 
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        // TODO Auto-generated method stub
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }
    
    public void measurementsChanged() {
        // 通知所有观察者
        notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure) {
        // 改变变量后
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // 
        measurementsChanged();
    }

}
