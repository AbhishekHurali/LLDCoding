package Practice;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    Value v;
    public Adder(Value v){
        this.v = v;
    }
    @Override
    public Void call() throws Exception {
        for(int i=0;i<100000;i++)
        {
            v.count = v.count +i;
        }
        return null;
    }
}
