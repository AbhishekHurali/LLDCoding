package ProducerConsumerWithSemaphores;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    int maxSize;
    ConcurrentLinkedDeque<Object> items;
     public Store(int maxSize)
     {
         this.maxSize = maxSize;
         this.items = new ConcurrentLinkedDeque<>();
     }

     public int getMaxSize(){
         return maxSize;
     }

     public ConcurrentLinkedDeque<Object> getItems()
     {
         return items;
     }

     public void addItems(){
         System.out.println("Producer producing, current size " + this.items.size());
         this.items.add(new Object());
     }

     public void removeItems(){
         System.out.println("Consumer consuming, current size " + this.items.size());
         this.items.remove();
     }
}
