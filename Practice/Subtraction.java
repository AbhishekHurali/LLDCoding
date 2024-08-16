package Practice;

import java.util.concurrent.Callable;

public class Subtraction implements Callable<Void> {
    Value v;
    public Subtraction(Value v){
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
        for(int i=0;i<100;i++)
        {
            v.count = v.count - i;
        }
        return null;
    }
}
