package ComparatorAndComparable;

public class Student implements Comparable<Student> {
    public String name;
    int age;
    int psp;


    @Override
    public int compareTo(Student o) {
        if(this.age < o.age)
        {
            return -1;
        }else if(this.age > o.age)
        {
            return 1;
        }
        return 0;
    }
}
