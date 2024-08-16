package ProducerConsumerWithSemaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Store store;
    Semaphore prodSema;
    Semaphore consSema;

    Producer(Store st,Semaphore prodSema,Semaphore consSema)
    {
        this.store = st;
        this.prodSema = prodSema;
        this.consSema = consSema;
    }
    @Override
    public void run() {
        while(true)
        {
            try
            {
                prodSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.addItems();
            consSema.release();
        }
    }
}
