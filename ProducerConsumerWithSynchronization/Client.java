package ProducerConsumerWithSynchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        Store store = new Store(5);
        ExecutorService es = Executors.newCachedThreadPool();

        for(int i=1;i<=8;i++)
        {
            es.execute(new Producer(store));
        }

        for(int i=1;i<=8;i++)
        {
            es.execute(new Producer(store));
        }

        for(int i=1;i<=8;i++)
        {
            es.execute(new Consumer(store));
        }
    }

}
