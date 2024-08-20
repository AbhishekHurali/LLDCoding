package DesignPatterns.Strategy;

public class PathCalculatorStrategyFactory {
    public static PathCalculatorStrategy getStrategy(TravelMode mode) {
        PathCalculatorStrategy strategy = null;
        if (mode == TravelMode.CAR) {
            strategy = new CarPathCalculator();
        }else if(mode == TravelMode.BIKE){
            strategy = new BikePathCalculator();
        }else if(mode== TravelMode.WALK){
            strategy = new WalkPathCalculator();
        }
        return strategy;
    }
}
