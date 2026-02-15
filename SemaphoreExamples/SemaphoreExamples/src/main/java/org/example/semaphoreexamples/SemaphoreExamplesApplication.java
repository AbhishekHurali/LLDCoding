package org.example.semaphoreexamples;

import org.example.semaphoreexamples.Classes.Bar;
import org.example.semaphoreexamples.Classes.Foo;
import org.example.semaphoreexamples.Classes.Number;
import org.example.semaphoreexamples.Classes.Zero;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

@SpringBootApplication
public class SemaphoreExamplesApplication {

    public static void main(String[] args) {

        //SpringApplication.run(SemaphoreExamplesApplication.class, args);

       // Semaphore fooSemaphore = new Semaphore(1);
        //Semaphore barSemaphore = new Semaphore(0);

        Semaphore zeroSemaphore = new Semaphore(1);
        Semaphore numberSemaphore = new Semaphore(0);

        ExecutorService executorService = Executors.newCachedThreadPool();

//        for(int i = 0; i < 5; i++) {
//            executorService.submit(new Foo(barSemaphore, fooSemaphore));
//        }
//
//        for(int i = 0; i < 5; i++) {
//            executorService.submit(new Bar(barSemaphore, fooSemaphore));
//        }

        for(int i = 1; i <= 5; i++) {
            executorService.submit(new Zero(zeroSemaphore,numberSemaphore));
        }

        for(int i = 1; i <=5; i++) {
            executorService.submit(new Number(zeroSemaphore, numberSemaphore));
        }


    }

}
