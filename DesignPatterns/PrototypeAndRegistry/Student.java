package DesignPatterns.PrototypeAndRegistry;

public class Student implements Prototype<Student> {

    String name;
    String batch;
    int age;
    String id;

    public Student(){

    }
    public Student(Student st) {
        this.name = st.name;
        this.age = st.age;
        this.id = st.id;
        this.batch = st.batch;
    }

    public Student copy() {
        return new Student(this);
    }

}
