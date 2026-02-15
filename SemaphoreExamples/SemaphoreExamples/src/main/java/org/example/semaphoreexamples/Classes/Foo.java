package org.example.semaphoreexamples.Classes;

import java.util.concurrent.Semaphore;

public class Foo implements Runnable {
    Semaphore barSema;
    Semaphore fooSema;

    public Foo(Semaphore barSema, Semaphore fooSema) {
        this.barSema = barSema;
        this.fooSema = fooSema;
    }

    @Override
    public void run() {

        try {
            fooSema.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("foo");
        barSema.release();
    }
}
