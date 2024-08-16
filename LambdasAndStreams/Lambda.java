package LambdasAndStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lambda {
    public static void main(String[] args) {
        Runnable r = new ThreadedProgram();
        Thread t = new Thread(r);
       // t.start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello to Anonymous class");
            }
       };
//        Thread t1 = new Thread(r1);
//        t1.start();

        Runnable r3 = () -> {
            System.out.println("Hello to Lambda");
        };

        Runnable r4 = () -> System.out.println("hello to lamda single statement");
//        Thread t1 = new Thread(r4);
//        t1.start();

        Student s = new Student();
        s.name ="Abhi";
        s.age = 29;
        s.psp=93;

        Student s1 = new Student();
        s1.name = "Vijju";
        s1.age = 28;
        s1.psp = 95;

        Student s2 = new Student();
        s2.name = "AbhiJaya";
        s2.age = 1;
        s2.psp = 0;

        ArrayList<Student> students = new ArrayList<>();
        students.add(s);
        students.add(s1);
        students.add(s2);

//        Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.age-o2.age;
//            }
//        });

        Collections.sort(students,(o1,o2)-> o2.age -o1.age); //implicitly assumes the type of o1 and o2
        for(Student o : students)
        {
            System.out.println(o.name);
            System.out.println(o.age);
            System.out.println(o.psp);
        }
    }
}
