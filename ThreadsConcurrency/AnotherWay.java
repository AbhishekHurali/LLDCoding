package ThreadsConcurrency;

public class AnotherWay extends Thread{
    public void run()
    {
        System.out.println("Another way ->" + Thread.currentThread().getName());
    }
}
