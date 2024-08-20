package DesignPatterns.Strategy;

public class CarPathCalculator implements PathCalculatorStrategy{
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Travelling "+source+" to "+destination+" by car");
    }
}
