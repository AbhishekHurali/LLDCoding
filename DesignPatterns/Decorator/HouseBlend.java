package DesignPatterns.Decorator;

public class HouseBlend implements  Beverage{

    Integer cost = 150;
    String description = "Signature Houseblend of Starbuzz ";
    @Override
    public Integer getCost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
