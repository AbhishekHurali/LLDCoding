package DesignPatterns.Decorator;

public class Milk implements  Addon{
    Integer cost = 50;
    String description = "Addon Milk";
    Beverage b;

    public Milk(Beverage b){
        this.b=b;
    }
    @Override
    public Integer getCost() {
        return b.getCost()+cost;
    }

    @Override
    public String getDescription() {
        return b.getDescription()+"\n"+description;    }
}
