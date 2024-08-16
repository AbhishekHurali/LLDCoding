package ProducerConsumerWithSynchronization;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int maxSize;
    List<Object> items;
     public Store(int maxSize)
     {
         this.maxSize = maxSize;
         this.items = new ArrayList<>();
     }

     public int getMaxSize(){
         return maxSize;
     }

     public List<Object> getItems()
     {
         return items;
     }

     public void addItems(){
         System.out.println("Producer producing, current size " + this.items.size());
         this.items.add(new Object());
     }

     public void removeItems(){
         System.out.println("Consumer consuming, current size " + this.items.size());
         this.items.remove(this.items.size()-1);
     }
}
