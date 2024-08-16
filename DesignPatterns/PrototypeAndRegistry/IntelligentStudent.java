package DesignPatterns.PrototypeAndRegistry;

public class IntelligentStudent extends Student{
    int iq;
    public IntelligentStudent(){
        super();
    }
    public IntelligentStudent(IntelligentStudent Inst) {
        super(Inst);
        this.iq = Inst.iq;
    }

    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }
}
