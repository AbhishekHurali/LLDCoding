package StaticKeyword;

public class Client {
    public static void main(String[] args) {
        User.display();
        Student.display();
        Student s = new Student();
        s.display();
        User u = new Student();
        u.display();
        User u1 = new User();
        u1.display();

    }
}
