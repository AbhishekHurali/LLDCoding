package org.example.semaphoreexamples.Classes;

import java.util.concurrent.Semaphore;

public class Zero implements Runnable {

    Semaphore zeroSemaphore;
    Semaphore numberSemaphore;
    public Zero(Semaphore zeroSemaphore, Semaphore numberSemaphore) {
        this.zeroSemaphore = zeroSemaphore;
        this.numberSemaphore = numberSemaphore;
    }

    @Override
    public void run() {

        try {
            zeroSemaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("0");
        numberSemaphore.release();

    }
}
