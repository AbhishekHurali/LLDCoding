package Interface;

public class Dog extends Animal implements Runner {
    public void run()
    {
        //x=10; //Cannot assign a value to final variable 'x
        System.out.println("Dog is running!");
    }

    @Override
    public void rehydrate() {
        System.out.println("Dog is drinking water");
    }

//    public void rest() {
//        System.out.println("Dog is resting");
//    }
    public void bark()
    {
        System.out.println("Dog is barking");
    }
}
