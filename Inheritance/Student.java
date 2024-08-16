package Inheritance;

public class Student extends User{
    String Batch;
    float psp;

    public Student()
    { super(1,"ZYX","ZYX password");
        Batch="A";
        psp=92.19f;
    }
    public void changeBatch()
    {
        username = "ABC";
        password = "ABC Password";
        // id = 1; Private data members cann't be inherited.
    }
    public Student(String batch, float psp)
    {
        super(1,"XYZ","XYZ password");
        this.Batch = batch;
        this.psp = psp;
        System.out.println("Parameterized constructor of Student is called");
    }
}
