package DesignPatterns.Strategy;

public class BikePathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Travelling "+source+" to "+destination+" by Bike");
    }
}
