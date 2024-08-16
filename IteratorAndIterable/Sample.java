package IteratorAndIterable;

import java.util.Iterator;
import java.util.List;

public class Sample implements Iterable<Integer> {
    List<Integer> list = List.of(2,4,5,7,4,3,5,9);


    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator(list);
    }
}
