package DesignPatterns.Observer;

public class CurrentDisplay implements Observer,DisplayElement{
    public float temp;
    public float humidity;
    public float pressure;
    public  WeatherData weatherData;

    public CurrentDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }


    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Temperature "+this.temp+" Humidity "+this.humidity+" Pressure "+this.pressure);
    }
}
