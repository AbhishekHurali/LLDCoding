package DesignPatterns.Builder;

public class Student {
    String name;
    String batch;
    int age;
    float psp;

    private Student(StudentBuilder sb) throws Exception {
        if(sb.name==null){
            System.out.println("Name can't be null");
            throw new Exception("Name Can't be null");
        }
        this.name = sb.name;
        if(sb.age<20){
            System.out.println("Age should be more than 20");
            throw new Exception("Age should be more than 20");
        }
        this.age = sb.age;
        if(sb.batch==null){
            System.out.println("batch can't be null");
            throw new Exception("batch Can't be null");
        }
        this.batch = sb.batch;
        if(sb.psp==0.0f){
            System.out.println("Psp is very less");
            throw new Exception("Psp should be more than at least 50");
        }
        this.psp = sb.psp;
    }

    public static StudentBuilder getStudentInstance() throws Exception {
        return new StudentBuilder();
    }

        public static class StudentBuilder {
            String name;
            String batch;
            int age;
            float psp;

            public StudentBuilder setName(String name){
                this.name = name;
                return this;
            }

            public StudentBuilder setBatch(String batch){
                this.batch = batch;
                return this;
            }

            public StudentBuilder setAge(int age){
                this.age = age;
                return this;
            }

            public StudentBuilder setPsp(float psp){
                this.psp = psp;
                return this;
            }

            public Student build() throws Exception {
                return new Student(this);
            }
        }
}
