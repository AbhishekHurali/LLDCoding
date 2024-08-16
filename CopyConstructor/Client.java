package CopyConstructor;

public class Client {
    public static void main(String[] args) {
        Exam e = new Exam(1,"DSA");
        Student s1 = new Student();
        Student s = new Student("Abhishek", 29, 92.19f,e);
        System.out.println(Student.noOfStudents);
        Student.display();
        Student.display(s);
        s.display(s);
        /* display() method is static hence should be accessed with class reference not through the instance reference */

    }
}
