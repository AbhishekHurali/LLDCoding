package SizeOfTheBinaryTreeUsingMultiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    Node root;
    ExecutorService es;
    public TreeSizeCalculator(Node root, ExecutorService es)
    {
        this.root = root;
        this.es = es;
    }
    public Integer call() throws ExecutionException, InterruptedException {
        if(root==null)
        {
            return 0;
        }
        else {
            Callable<Integer> leftNode = new TreeSizeCalculator(root.left, es);
            Callable<Integer> rightNode = new TreeSizeCalculator(root.right, es);

            Future<Integer> leftNodeFuture = es.submit(leftNode);
            Future<Integer> rightNodeFuture = es.submit(rightNode);

            return (leftNodeFuture.get() + rightNodeFuture.get() + 1);

        }
    }
}
