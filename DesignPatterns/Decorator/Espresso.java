package DesignPatterns.Decorator;

public class Espresso implements Beverage{
    Integer cost = 200;
    String description = "Starbuzz Espresso leave a mark in your heart ";
    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
