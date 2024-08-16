package ProducerConsumerWithSemaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    Store store;
    Semaphore prodSema;
    Semaphore consSema;

    Consumer(Store st,Semaphore prodSema,Semaphore consSema){

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
                consSema.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            store.removeItems();
            prodSema.release();
        }
    }
}
