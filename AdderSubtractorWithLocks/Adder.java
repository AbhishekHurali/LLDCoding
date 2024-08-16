package AdderSubtractorWithLocks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value v;
    Lock lock;
    Lock lock2;
    public Adder(Value v,Lock lock,Lock lock2)
    {
        this.v = v;
        this.lock = lock;
        this.lock2 = lock2;
    }
    @Override
    public Void call()
    {
        //lock.lock(); if we use locks outside the for loop then the main purpose of using multithreading will be wasted
       //because only after Adder completely finishes the job then Subtractor will start its job.
//        for(int i=1;i<=1000;i++)// Explaining deadlock
//        {
//            lock2.lock();
//            lock.lock();
//            System.out.println("Adding taking place : -> "+ v.count);
//            v.count = v.count+i;
//            lock.unlock();
//            lock2.unlock();
//        }
        for(int i=1;i<=1000;i++)
        {
           // lock2.lock();
            lock.lock();
            System.out.println("Adding taking place : -> "+ v.count);
            v.count = v.count+i;
            lock.unlock();
           // lock2.unlock();
        }
        //lock.unlock();
        return null;
    }
}
