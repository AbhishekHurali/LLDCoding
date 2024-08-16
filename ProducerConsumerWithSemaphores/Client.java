package ProducerConsumerWithSemaphores;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        Semaphore prodSema = new Semaphore(5);
        Semaphore consSema = new Semaphore(0);
        ExecutorService es = Executors.newCachedThreadPool();

        for(int i=1;i<=8;i++)
        {
            es.execute(new Producer(store,prodSema,consSema));
        }

        for(int i=1;i<=8;i++)
        {
            es.execute(new Consumer(store,prodSema,consSema));
        }
    }

}
