package DesignPatterns.Factory.DataBase;

public class Client {
    public static void main(String[] args) {
        DataBase Mdb = new MySql();
        DataBase Pdb = new Postgres();
        DataBase Ddb = new Dynamo();

        Mdb.createQuery();
        Pdb.createQuery();
        Ddb.createQuery();

    }
}
