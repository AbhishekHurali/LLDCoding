package ArrayCreatorUsingMultiThread;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class ArrayCreator implements Callable<ArrayList<Integer>> {
    int number;
    ExecutorService es;
    public ArrayCreator(int number, ExecutorService es)
    {
        this.number = number;
        this.es = es;
    }
    public ArrayList<Integer> call()
    {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=number;i++)
        {
            arr.add(i);
        }
        return arr;
    }
}
