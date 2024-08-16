package Interface;

public class Client {
    public static void main(String[] args) {
        Dog d = new Dog();
        Runner r = new Dog();
//        Runner r1 = new Runner(0); 'Runner' is abstract; cannot be instantiated
        r.run();
        d.run();
        r.rehydrate();
        d.bark();
        //r.bark(); the reference variable type r is limited to own methods in the interface
        r.rest();
       // d.rest();
    }
}
