package ProducerConsumerWithSynchronization;

public class Producer implements Runnable{
    Store store;

    Producer(Store st){
        this.store = st;
    }
    @Override
    public void run() {
        while(true)
        {
            synchronized (store)
            {
                if(store.getItems().size() < store.getMaxSize())
                {
                    store.addItems();
                }
            }
        }
    }
}
