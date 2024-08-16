package ThreadsConcurrency;

public class HelloScaler implements Runnable{
    public void run()
    {
        System.out.println("Hello Scaler -> " + Thread.currentThread().getName());
    }
}
