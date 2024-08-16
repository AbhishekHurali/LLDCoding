package IntroToThreads2;

public class Adder implements Runnable{
    int sum;
    public Adder(int x,int y)
    {
        sum=x+y;
    }
    public void run()
    {
        System.out.println(sum);
    }
}
