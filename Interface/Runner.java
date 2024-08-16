package Interface;

public interface Runner {
    int x=10;
    public void run();
    public void rehydrate();
    default void rest()
    {
        System.out.println("Runner is Resting");
    }
}
