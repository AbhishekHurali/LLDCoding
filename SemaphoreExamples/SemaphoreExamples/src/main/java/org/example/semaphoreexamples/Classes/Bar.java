package org.example.semaphoreexamples.Classes;

import java.util.concurrent.Semaphore;

public class Bar implements Runnable {
    Semaphore barSema;
    Semaphore fooSema;
    public Bar(Semaphore barSema, Semaphore fooSema) {
        this.barSema = barSema;
        this.fooSema = fooSema;

    }

    @Override
    public void run() {

        try {
            barSema.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("bar");
        fooSema.release();
    }


}
