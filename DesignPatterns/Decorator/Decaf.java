package DesignPatterns.Decorator;

public class Decaf implements  Beverage{
    Integer cost = 120;
    String description = "Enjoy the no-caffeine drink ";
    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
