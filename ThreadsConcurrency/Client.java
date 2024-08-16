package ThreadsConcurrency;

public class Client {
    public static void main(String[] args) {
        HelloWorldPrinter helloWorldObject = new HelloWorldPrinter();
        helloWorldObject.run();
        System.out.println(Thread.currentThread().getName());
        Thread t = new Thread(helloWorldObject);
        t.start();

        //Another way of starting the thread
        AnotherWay a = new AnotherWay();
        Thread t2 = new Thread(a);
        t2.start();

        // Printing 0 to 100 numbers but each number should be printed by a new thread
        for(int i=0;i<=100;i++)
        {
            PrintNumbers0to100 num = new PrintNumbers0to100(i);
            Thread th = new Thread(num);
            th.start();
        }

    }
}
