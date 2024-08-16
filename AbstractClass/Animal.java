package AbstractClass;

public abstract class Animal {
    public abstract void move();
    String type;
    int weight;
    public void aliveOrDead()
    {
        System.out.println("Checking animal is alive or dead");
    }
    public void bark()
    {
        System.out.println("Animal is barking");
    }
}
