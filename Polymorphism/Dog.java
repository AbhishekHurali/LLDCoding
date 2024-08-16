package Polymorphism;

public class Dog extends Animal {
    String name;
    public Dog()
    {

    }
    public Dog(String name)
    {
        this.name=name;
    }
    public void move()
    {
        System.out.println("Dog is moving");
    }
    public void bark()
    {
        System.out.println("Dog is barking");
    }
    public void bark(String dog_name)
    {
        System.out.println(name + " and " + dog_name+ " dogs are barking");
    }
}
