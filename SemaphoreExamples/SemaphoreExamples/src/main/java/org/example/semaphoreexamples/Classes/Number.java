package org.example.semaphoreexamples.Classes;

import java.util.concurrent.Semaphore;

public class Number implements Runnable {

    private Semaphore numberSemaphore;
    private Semaphore zeroSemaphore;
    static int number = 1;
//    int number;

    public Number(Semaphore zeroSemaphore, Semaphore numberSemaphore) {
        this.zeroSemaphore = zeroSemaphore;
        this.numberSemaphore = numberSemaphore;
        //this.number = number;
    }

    @Override
    public void run() {

        try {
            numberSemaphore.acquire();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print(number++);
        zeroSemaphore.release();
    }
}
