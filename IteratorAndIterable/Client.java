package IteratorAndIterable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        HashMap<String,Integer> hm =new HashMap<>();
        hm.put("Vijju",12);
        hm.put("Abhi",10);
        hm.put("Jaya",14);
        hm.put("Manu",8);

        Iterator<Map.Entry<String,Integer>> i = hm.entrySet().iterator();

        while(i.hasNext()){
            Map.Entry<String,Integer> entry = i.next();
            System.out.println(entry.getKey() +" "+entry.getValue());
        }

       // System.out.println(hm);
        Sample s = new Sample();
        for(Integer ele: s)
        {
            System.out.print(ele +" ");
        }

    }
}
