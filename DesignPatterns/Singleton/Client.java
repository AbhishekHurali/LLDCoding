package DesignPatterns.Singleton;

public class Client {
    public static void main(String[] args) {
        DbConn db1 = DbConn.getDBInstance("localhost","Abhi");
        DbConn db2 = DbConn.getDBInstance("localhost","AbhiVijju");
        DbConn db3 = DbConn.getDBInstance("localhost2","AbhiPassPass");

        System.out.println("DEBUG");

    }
}
