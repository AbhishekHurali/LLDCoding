package SizeOfTheBinaryTreeUsingMultiThread;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newCachedThreadPool();
        TreeSizeCalculator tree = new TreeSizeCalculator(null,es);
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);
        tree.root.left.right = new Node(6);

        Future<Integer> treeFuture = es.submit(tree);
        int size = treeFuture.get();
        System.out.println(size);

    }
}
