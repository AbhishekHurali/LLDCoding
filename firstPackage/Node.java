package firstPackage;

import java.util.Iterator;

public class Node implements Iterable<Node> {
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }

    public Node(int data,Node next)
    {
        this.data=data;
        this.next=next;
    }

    @Override
    public Iterator<Node> iterator()
    {
        return new nodeIterator(this);
    }

    public static class nodeIterator implements Iterator<Node>
    {
        Node root;

        nodeIterator(Node root )
        {
            this.root=root;
        }

        @Override
        public boolean hasNext()
        {
            return root!=null;
        }

        @Override
        public Node next()
        {
            Node temp=root;
            root=root.next;
            return temp;
        }
    }
}
