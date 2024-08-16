package DesignPatterns.Decorator;

public class Sugar implements  Addon{
    Integer cost = 50;
    String description = "Addon Sugar";
    Beverage b;

    public Sugar(Beverage b){
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
