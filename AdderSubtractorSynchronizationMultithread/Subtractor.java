package AdderSubtractorSynchronizationMultithread;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    Value v;
    public Subtractor(Value v)
    {
        this.v = v;
    }
    // The below method is using synchronized methods in the Value class
    public Void call()
    {
        for(int i=1;i<1000;i++)
        {
            v.increment(i);
        }
        return null;
    }
//    @Override
    //This is the one way
//    public Void call()
//    {
//        for(int i=1;i<=10000;i++)
//        {
//            synchronized (v)
//            {
//                v.count = v.count-i;
//            }
//        }
//        return null;
//    }
}
