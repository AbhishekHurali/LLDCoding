package Practice;

import AdderSubtractorSynchronizationMultithread.Subtractor;

import javax.sql.ConnectionPoolDataSource;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void swap(Student s,Student s1)
    {
        int tage = s.age;
        s.age=s1.age;
        s1.age = tage;

        String tname = s.name;
        s.name = s1.name;
        s1.name = tname;
    }
    public static void swap1(Student s,Student s1)
    {
        Student t = s;
        s=s1;
        s1=t;
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Pair p = new Pair(2.3f,1);
//        int i = (int) p.first;
//        System.out.println(i);

//        Student s = new Student();
//        s.age=10;
//        s.name="Abhi";
//        Student s1 = new Student();
//        s1.age=20;
//        s1.name="Vijju";
//
//        swap1(s,s1);
//        swap(s,s1);
////        System.out.println("Student s details "+ s.age +" "+ s.name);
////        System.out.println("Student s1 details "+ s1.age +" "+ s1.name);
//        Value v = new Value();
//        ExecutorService es = Executors.newCachedThreadPool();
//        Adder add = new Adder(v);
//        Subtraction sub = new Subtraction(v);
//
//        Future<Void> addF = es.submit(add);
//        Future<Void> subF = es.submit(sub);
//
//        addF.get();
//        subF.get();

        //System.out.println(v.count);

//        List<Integer> numList = List.of(1,2,3,2,4,6,7,5,4,3);

//        numList.stream()
//                .forEach((elements)-> System.out.println(elements));

//        List<Integer> list1 = numList.stream()
//                .limit(5)
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(list1);

//        List<Integer> list1 = numList.stream()
//                .filter((element)-> {return element%2==0;})
//                .collect(Collectors.toList());
//        System.out.println(list1);

//        List<Integer> list1 = numList.stream()
//                .map((element)-> {return element*element;})
//                .collect(Collectors.toList());
//        System.out.println(list1);

//        Optional<Integer> list1 = numList.stream()
//                .map((element)-> {return element*element;})
//                .findFirst();
//        System.out.println(list1);

//      Integer new_sum = numList.stream()
//                .reduce(0,(curr_sum,element)->{return curr_sum+element;});
//        System.out.println(new_sum);

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hello to runnable");
//            }
//        };

//        Runnable r = () -> {System.out.println("Hello to run");
//            System.out.println("Hello to second print");};
//        Thread t = new Thread(r);
//        t.start();
//
//        List<String> list = List.of("Apple","banana","ball","Strawberry");
//
//        List<Integer> list1 =list.stream()
//                .filter(element->{return element.charAt(0)=='b';})
//                .map((element)->{return element.length();})
//                .collect(Collectors.toList());
//
//        System.out.println(list1);
//        ExecutorService es = Executors.newFixedThreadPool(20);
//        Runnable r = new NumberPrinter();
//        es.execute(r);
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi","kiwi");

        // What does the following code snippet do?
//        boolean allMatch = words.parallelStream()
//                .allMatch(w -> w.length() > 3);
//
//        System.out.println("All match: " + allMatch);
//        String result = words.stream()
//                .collect(Collectors.joining(", "));
//
//        System.out.println("Result: " + result);
        Set<String> uniqueFruits = words.stream()
                .collect(Collectors.toSet());

        System.out.println("Result: " + uniqueFruits);

        TreeSet<String> set = new TreeSet<>();

       // Properties
        // Logger
       //PrintWriter
        //FileWriter
        //ConnectionPoolDataSource


    }
}
