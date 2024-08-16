package DesignPatterns.Decorator;

public class Robusta implements  Beverage{
    Integer cost = 180;
    String description = "From the nature of western ghats, just feel it! ";
    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
