package DesignPatterns.Strategy;

public class GoogleMaps {
    public static void main(String[] args) {
        String source = "Bangalore";
        String destination ="Hubli";
        PathCalculatorStrategy p = PathCalculatorStrategyFactory.getStrategy(TravelMode.WALK);
        p.findPath(source,destination);
    }
}
