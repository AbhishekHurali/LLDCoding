package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) throws Exception {

       // Version 1
//        StudentBuilder sb = new StudentBuilder();
//        sb.setName("Abhishek");
//        sb.setAge(29);
//        sb.setBatch("SeptLLD");
//        sb.setPsp(93.29f);

        //Student st = new Student(sb);

        //Version 2
//        StudentBuilder sb = new StudentBuilder();
//        sb.setName("Abhishek");
//        sb.setAge(29);
//        sb.setBatch("SeptLLD");
//        sb.setPsp(93.29f);
//
//        Student st = Student.getStudentInstance(sb);
//        System.out.println("Debug");

        Student st = Student.getStudentInstance()//this will return StudentBuilder object let's say sb
                .setAge(29)// read as sb.setAge(29);
                .setBatch("SeptLLD")
                .setName("Abhi")
                .setPsp(93.29f)
                .build();//read as sb.build();
        //because all will return StudentBuilder object except build().
    }
}
