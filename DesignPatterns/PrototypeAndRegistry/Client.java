package DesignPatterns.PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegister(registry);

        Student s1 = registry.get("Abhi");
        Student s2 = registry.get("Vijju");
        Student s3 = registry.get("AbhiJaya");
        s3.age = 10;
        s3.name="newBaby";
        System.out.println("DEBUG");

    }

    public static void fillRegister(StudentRegistry registry){
        Student st = new Student();
        st.name ="Abhi";
        st.age=29;
        st.batch ="SeptLLD";
        st.id="12345";

        IntelligentStudent Inst = new IntelligentStudent();
        Inst.name ="Vijju";
        Inst.age=29;
        Inst.batch ="JuneLLD";
        Inst.id="12346";
        Inst.iq = 110;

        Student st1 = new Student();
        st1.name ="AbhiJaya";
        st1.age=20;
        st1.batch ="JanLLD";
        st1.id="123";

        registry.put("Abhi",st);
        registry.put("Vijju",Inst);
        registry.put("AbhiJaya",st1);
    }
}
