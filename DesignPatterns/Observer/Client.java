package DesignPatterns.Observer;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        StatisticDisplay statisticsDisplay = new StatisticDisplay(weatherData);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);


        weatherData.setData(29f, 100, 250);
        weatherData.setData(32f, 50, 360);

        statisticsDisplay.deRegister();

        weatherData.setData(30f, 10, 200);
    }
}
