package CollectionFramework;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(4);
        q1.add(1);
        q1.add(9);

        Queue<Integer> q2 = new PriorityQueue<>();
        q2.add(4);
        q2.add(1);
        q2.add(9);

        Queue<Integer> q3 = new ArrayDeque<>();
        q3.add(4);
        q3.add(1);
        q3.add(9);

//        System.out.println("LinkedList q1 :" + q1);
//        System.out.println("PriorityQueue q2 :" + q2);
//        System.out.println("ArrayDeque q3 :" + q3);

        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(2);
        set1.add(4);
        set1.add(9);

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(5);
        set2.add(2);
        set2.add(4);
        set2.add(9);

        Set<Integer> set3 = new TreeSet<>();
        set3.add(5);
        set3.add(2);
        set3.add(4);
        set3.add(9);

//        System.out.println("HashSet :" + set1);
//        System.out.println("LinkedHashSet :" + set2);
//        System.out.println("TreeSet :" + set3);

        Map<Integer,Integer> map1 = new HashMap<>();
        map1.put(5,5);
        map1.put(3,3);
        map1.put(6,9);
        map1.put(1,10);

        Map<Integer,Integer> map2 = new LinkedHashMap<>();
        map2.put(5,5);
        map2.put(3,3);
        map2.put(6,9);
        map2.put(1,10);

        Map<Integer,Integer> map3 = new TreeMap<>();
        map3.put(5,5);
        map3.put(3,3);
        map3.put(6,9);
        map3.put(1,10);

        System.out.println("HashMap : "+ map1 );
        System.out.println("LinkedHashMap : "+ map2 );
        System.out.println("TreeMap : "+ map3 );

    }
}
