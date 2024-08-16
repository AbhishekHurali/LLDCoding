package IteratorAndIterable;

import java.util.Iterator;
import java.util.List;

public class CustomIterator implements Iterator<Integer> {
    int index;
    List<Integer> list;
    public CustomIterator(List<Integer> list)
    {
        index=0;
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Integer next() {
        return list.get(index++);
    }
}
