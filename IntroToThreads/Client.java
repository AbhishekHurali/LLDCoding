package IntroToThreads;

public class Client {
    public static void main(String[] args) {
        System.out.println("I am the main class");
        Adder ad = new Adder();
        Thread at = new Thread(ad);
        at.start();
        Subtractor sb = new Subtractor();
        Thread st = new Thread(sb);
        st.start();
    }
}
