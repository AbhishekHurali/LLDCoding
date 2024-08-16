package CopyConstructor;

public class Student {
    String name;
    int age;
    float psp;
    Exam exam;
    static int noOfStudents;

    public Student()
    {
        noOfStudents++;
    }

    public Student(String name, int age, float psp, Exam e)
    {
        this.name = name;
        this.age = age;
        this.psp = psp;
        //this.exam = e; // Shallow Copy
        this.exam = new Exam(e); // Deep Copy
        noOfStudents++;
    }

    public static void display()
    {
        System.out.println(noOfStudents);
       // System.out.println(name); //Non-static field 'name' cannot be referenced from a static context
    }
    public static void display(Student s)
    {
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.psp);
        System.out.println(s.exam.id);
        System.out.println(s.exam.exam_name);
    }
}
