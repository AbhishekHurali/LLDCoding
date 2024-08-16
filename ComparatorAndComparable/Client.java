package ComparatorAndComparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Abhi";
        s.age = 29;
        s.psp = 93;

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

//        Collections.sort(students);

        Collections.sort(students, new PSPComparator());
        for(Student o : students) {
            System.out.println(o.name);
            System.out.println(o.age);
            System.out.println(o.psp);
        }


    }
}
