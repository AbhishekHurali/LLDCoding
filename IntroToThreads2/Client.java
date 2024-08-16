package IntroToThreads2;

import IntroToThreads3.TableCreator;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner scn = new Scanner(System.in);
        x = scn.nextInt();
        y = scn.nextInt();
        Adder ad = new Adder(x,y);
        Thread st = new Thread(ad);
        st.start();
    }
}
