package ThreadsConcurrency;

public class PrintNumbers0to100 implements  Runnable{
    int i;
    public PrintNumbers0to100(int i)
    {
        this.i = i;
    }
    public void run()
    {
        System.out.println(i+" -> "+ Thread.currentThread().getName());
    }
}
