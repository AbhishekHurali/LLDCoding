package Polymorphism;

public class Client {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.move();//Method overriding
       // a.bark();//Parent class references cann't access child class methods
        Dog d = new Dog("Mudhol");
        d.bark();
        d.bark("tommy");//Method Overloading
    }
}
