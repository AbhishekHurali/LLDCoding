package Inheritance;

public class User {
    private int id;
    String username;
    String password;

//    public User()
//    {
//        id=1;
//        username = "XYZ";
//        password = "XYZ password";
//        System.out.println("Non Parameterized constructor of User is called");
//    }
    public User(int id)
    {
        this.id=id;
    }
    public User(int id, String username)
    {
        this(id);
        this.username=username;
    }
    public User(int id, String username,String password)
    {
        this(id,username);
        this.password = password;
        System.out.println("Parameterized constructor of User is called");
    }
    public int get_id()
    {
        return id;
    }
}
