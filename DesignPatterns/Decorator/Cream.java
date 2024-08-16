package DesignPatterns.Decorator;

public class Cream implements  Addon{
    Integer cost = 50;
    String description = "Addon fat free heavy cream";
    Beverage b;

    public Cream(Beverage b){
        this.b=b;
    }
    @Override
    public Integer getCost() {
        return b.getCost()+cost;
    }

    @Override
    public String getDescription() {
        return b.getDescription()+"\n"+description;
    }
}
