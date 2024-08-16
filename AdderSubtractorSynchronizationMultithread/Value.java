package AdderSubtractorSynchronizationMultithread;

public class Value {
    int count;
    synchronized void increment(int i)
    {
        count= count+i;
    }
    synchronized  void decrement(int i)
    {
        count = count -i;
    }
}
