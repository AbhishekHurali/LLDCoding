package AbstractClass;

public class Client {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.move();
        a.aliveOrDead();
        a.bark();
        Animal m = new Mammal();
        m.move();
        m.aliveOrDead();
    }
}
