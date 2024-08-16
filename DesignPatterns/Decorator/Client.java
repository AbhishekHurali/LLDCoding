package DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        Beverage h = new HouseBlend();
        h = new Milk(h);
        h = new Cream(h);
        h = new Cream(h);
        h = new Sugar(h);

        System.out.println(h.getDescription());
        System.out.println("Total cost :  "+h.getCost());
        System.out.println(".............................");

        Beverage d = new Decaf();
        d = new Milk(d);
        d = new Cream(d);
        d = new Sugar(d);
        d = new Sugar(d);
        System.out.println(d.getDescription());
        System.out.println("Total cost :  "+d.getCost());
        System.out.println(".............................");

        Beverage r = new Robusta();
        r = new Milk(r);
        r = new Milk(r);
        r = new Cream(r);
        r = new Sugar(r);

        System.out.println(r.getDescription());
        System.out.println("Total cost :  "+r.getCost());
        System.out.println(".............................");

        Beverage e = new Espresso();
        e = new Milk(e);
        e = new Milk(e);
        e = new Cream(e);
        e = new Sugar(e);
        System.out.println(e.getDescription());
        System.out.println("Total cost :  "+e.getCost());
        System.out.println(".............................");

    }
}
