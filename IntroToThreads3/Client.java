package IntroToThreads3;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();
        for(int i=1;i<=n;i++)
        {
            TableCreator ad = new TableCreator(i);
            Thread th = new Thread(ad);
            th.start();
        }
    }
}