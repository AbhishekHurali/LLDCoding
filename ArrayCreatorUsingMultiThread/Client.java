package ArrayCreatorUsingMultiThread;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        ArrayCreator arr = new ArrayCreator(number,es);

        Future<ArrayList<Integer>> arrFuture = es.submit(arr);
        ArrayList<Integer> resultArr = arrFuture.get();

        System.out.println(resultArr);

    }
}
