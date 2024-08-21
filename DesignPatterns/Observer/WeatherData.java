package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    List<Observer> observers = new ArrayList<>();
    public float temp;
    public float humidity;
    public float pressure;

    @Override
    public void addObserver(Observer o) {
       observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyAllObservers() {
        System.out.println("Let's Notify All The Observers");
        for(Observer o:observers){
            o.update(temp,humidity,pressure);
        }
    }

    public void setData(float temp,float humidity,float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        notifyAllObservers();
    }
}
